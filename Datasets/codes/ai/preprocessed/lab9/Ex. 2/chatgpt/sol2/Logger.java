import java.util.ArrayList;
import java.util.Date;
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

    public void log(String message, boolean success) {
        logs.add(new Date() + " | " + (success ? "[SUCCESS] " : "[FAILURE] ") + message);
    }

    public void printLogs() {
        System.out.println("---- LOGS ----");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}