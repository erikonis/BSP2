import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class GameLogger {
    private static GameLogger instance;
    private final List<String> logs;
    private static final DateTimeFormatter TIMESTAMP_FORMAT =
        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private GameLogger() {
        logs = new ArrayList<>();
    }

    public static synchronized GameLogger getInstance() {
        if (instance == null) {
            instance = new GameLogger();
        }
        return instance;
    }

    public void logAction(Action action, boolean success, String details) {
        String logEntry = String.format("[%s] %s %s %s: %s",
            action.getTimestamp().format(TIMESTAMP_FORMAT),
            action.getUser().getName(),
            success ? "executed" : "failed to execute",
            action.getClass().getSimpleName(),
            details);

        logs.add(logEntry);
    }

    public void logDeath(Character killer, Character victim) {
        String deathMessage;
        if (killer == null) {
            deathMessage = String.format("[%s] %s died",
                LocalDateTime.now().format(TIMESTAMP_FORMAT),
                victim.getName());
        } else if (killer == victim) {
            deathMessage = String.format("[%s] %s killed themselves",
                LocalDateTime.now().format(TIMESTAMP_FORMAT),
                killer.getName());
        } else {
            deathMessage = String.format("[%s] %s killed %s",
                LocalDateTime.now().format(TIMESTAMP_FORMAT),
                killer.getName(),
                victim.getName());
        }

        logs.add(deathMessage);
    }

    public void printLogs() {
        System.out.println("=== GAME EVENT LOG ===");
        logs.forEach(System.out::println);
        System.out.println("=====================");
    }

    public void clearLogs() {
        logs.clear();
    }
}