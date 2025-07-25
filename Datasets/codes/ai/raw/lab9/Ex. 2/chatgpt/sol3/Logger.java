import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance;
    private final List<String> logs = new ArrayList<>();

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logAction(String action, Character user, Character target, boolean success) {
        String log = LocalDateTime.now() + " | " + user.getName() + " performed " + action;
        if (target != null) log += " on " + target.getName();
        log += " | Success: " + success;
        logs.add(log);
    }

    public void logDeath(Character character, String cause) {
        String log = LocalDateTime.now() + " | " + character.getName() + " has " + cause + ".";
        logs.add(log);
    }

    public void printLogs() {
        for (String log : logs) {
            System.out.println(log);
        }
    }
}