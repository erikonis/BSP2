import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class GameEventLogger implements ActionEventListener, CharacterEventListener {
    private static final DateTimeFormatter TIME_FORMATTER =
        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                        .withZone(ZoneId.systemDefault());

    private final List<String> eventLog = new ArrayList<>();
    private Character lastKiller;

    @Override
    public void onActionExecuted(Action action, boolean success, String details) {
        String timestamp = TIME_FORMATTER.format(action.timestamp);
        String status = success ? "SUCCESS" : "FAILURE";
        String logEntry = String.format("[%s] [%s] %s: %s - %s",
            timestamp,
            status,
            action.actor.getName(),
            action.getClass().getSimpleName(),
            details);

        eventLog.add(logEntry);
    }

    @Override
    public void onHealthChanged(Character character, int oldHealth, int newHealth) {
        // Optional: Log health changes if needed
    }

    @Override
    public void onCharacterDied(Character character) {
        String timestamp = TIME_FORMATTER.format(Instant.now());
        String deathMessage;

        if (lastKiller != null && lastKiller != character) {
            deathMessage = String.format("[%s] %s was killed by %s",
                timestamp, character.getName(), lastKiller.getName());
            lastKiller = null;
        } else {
            deathMessage = String.format("[%s] %s died",
                timestamp, character.getName());
        }

        eventLog.add(deathMessage);
    }

    public void printLogs() {
        System.out.println("=== GAME EVENT LOG ===");
        eventLog.forEach(System.out::println);
        System.out.println("=====================");
    }

    public void clearLogs() {
        eventLog.clear();
    }
}