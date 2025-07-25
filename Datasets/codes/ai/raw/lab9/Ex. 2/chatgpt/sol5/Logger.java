import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance = null;
    private final List<String> logs = new ArrayList<>();

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logAction(String action, Character user, Character target, boolean success) {
        String timestamp = LocalDateTime.now().toString();
        String log = timestamp + " - " + user.getName() + " used " + action;
        if (target != null) {
            log += " on " + target.getName();
        }
        log += success ? " [SUCCESS]" : " [FAILED]";
        logs.add(log);
    }

    public void logDeath(Character victim, Character killer) {
        String timestamp = LocalDateTime.now().toString();
        String log = timestamp + " - " + victim.getName() + " was killed";
        if (killer != null) {
            log += " by " + killer.getName();
        }
        logs.add(log);
    }

    public void logSuicide(Character character) {
        String timestamp = LocalDateTime.now().toString();
        logs.add(timestamp + " - " + character.getName() + " committed suicide.");
    }

    public void printLogs() {
        System.out.println("=== Game Logs ===");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
