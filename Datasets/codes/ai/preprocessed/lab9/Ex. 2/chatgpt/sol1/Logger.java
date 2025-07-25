import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance;
    private final List<String> logs;

    private Logger() {
        logs = new ArrayList<>();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logAction(Character user, Action action, boolean success, Character target) {
        String status = success ? "SUCCESS" : "FAILED";
        String entry = LocalDateTime.now() + " | " + action.description() + " | " + status;
        logs.add(entry);
    }

    public void logDeath(Character killer, String victimName) {
        String entry = LocalDateTime.now() + " | " + killer.getName() + " killed " + victimName + "!";
        logs.add(entry);
    }

    public void printLogs() {
        System.out.println("Event Log:");
        logs.forEach(System.out::println);
    }
}