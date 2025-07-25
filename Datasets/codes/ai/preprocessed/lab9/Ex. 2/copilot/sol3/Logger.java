import java.util.ArrayList;
import java.util.List;

public class Logger implements EventListener {
    private static Logger instance;
    private List<String> logs;

    private Logger() {
        logs = new ArrayList<>();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    @Override
    public void update(Event event) {
        String log = event.getDate() + ": " + event.getUser().getName() + " performed " + event.getAction();
        if (event.getTarget() != null) {
            log += " on " + event.getTarget().getName();
        }
        log += ". Success: " + event.isSuccess();
        logs.add(log);
    }

    public void printLogs() {
        for (String log : logs) {
            System.out.println(log);
        }
    }
}