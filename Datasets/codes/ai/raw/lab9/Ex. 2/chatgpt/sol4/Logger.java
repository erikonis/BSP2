import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Logger {
    private static Logger instance;
    private final List<String> logs = new ArrayList<>();

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }

    public void log(String message) {
        String timestamp = new Date().toString();
        logs.add("[" + timestamp + "] " + message);
    }

    public void printAllLogs() {
        System.out.println("===== EVENT LOG =====");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
