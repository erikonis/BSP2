import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameLogger {
    private static GameLogger instance;
    private final List<String> logs;

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
        String log = String.format("[%s] %s - %s. Success: %b. %s",
            new Date(),
            action.getUser().getName(),
            action.getDescription(),
            success,
            details);
        logs.add(log);
    }

    public void logKill(Character killer, Character victim) {
        String log = String.format("[%s] KILL EVENT: %s killed %s",
            new Date(),
            killer.getName(),
            victim.getName());
        logs.add(log);
    }

    public void logSuicide(Character character) {
        String log = String.format("[%s] SUICIDE EVENT: %s killed themselves",
            new Date(),
            character.getName());
        logs.add(log);
    }

    public void printLogs() {
        System.out.println("=== GAME EVENT LOG ===");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}