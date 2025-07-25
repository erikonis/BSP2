import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance;
    private List<String> logs;
    private DateTimeFormatter formatter;

    private Logger() {
        this.logs = new ArrayList<>();
        this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logEvent(String event) {
        String timestampedEvent = formatter.format(LocalDateTime.now()) + " - " + event;
        logs.add(timestampedEvent);
        System.out.println(timestampedEvent);
    }

    public void printAllLogs() {
        System.out.println("\n--- All Logs ---");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
