import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public final class GameLogger {
    private static GameLogger instance;
    private final List<GameEvent> events = new ArrayList<>();
    private final List<Consumer<GameEvent>> subscribers = new ArrayList<>();

    private GameLogger() {}

    public static synchronized GameLogger getInstance() {
        if (instance == null) {
            instance = new GameLogger();
        }
        return instance;
    }

    public GameLogger subscribe(Consumer<GameEvent> subscriber) {
        subscribers.add(subscriber);
        return this;
    }

    public void log(GameAction action, ActionOutcome outcome) {
        GameEvent event = new GameEvent(
            Instant.now(),
            action,
            outcome
        );
        
        events.add(event);
        subscribers.forEach(s -> s.accept(event));
        
        if (outcome instanceof ActionOutcome.Success success 
            && success.modifiedTarget() != null 
            && !success.modifiedTarget().isAlive()) {
                
            logDeath(success.actor(), success.modifiedTarget());
        }
    }

    private void logDeath(Character actor, Character deceased) {
        GameEvent deathEvent = new GameEvent(
            Instant.now(),
            null,
            new ActionOutcome.Success(
                actor,
                deceased,
                "%s %s".formatted(
                    deceased.name(),
                    actor.equals(deceased) ? "committed suicide" : "was killed by " + actor.name()
                )
            )
        );
        events.add(deathEvent);
    }

    public List<String> getFormattedLogs() {
        return events.stream()
            .map(GameEvent::format)
            .toList();
    }

    public record GameEvent(
        Instant timestamp,
        GameAction action,
        ActionOutcome outcome
    ) {
        public String format() {
            return "[%s] %s".formatted(
                timestamp.toString(),
                switch (outcome) {
                    case ActionOutcome.Success s -> s.message();
                    case ActionOutcome.Failure f -> "FAILED: " + f.errorMessage();
                }
            );
        }
    }
}