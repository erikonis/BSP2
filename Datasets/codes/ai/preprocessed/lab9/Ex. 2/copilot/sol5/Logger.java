import java.util.ArrayList;
import java.util.Date;

public class Logger {
    private static Logger instance = null;
    private ArrayList<String> logs;

    private Logger() {
        logs = new ArrayList<>();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logEvent(Date date, String user, String action, String target, boolean success) {
        String log = date + ": " + user + " performed " + action + (target != null ? " on " + target : "") + ". Success: " + success;
        logs.add(log);
        System.out.println(log);
    }

    public void logKillEvent(Date date, String killer, String victim) {
        String log = date + ": " + killer + " killed " + victim;
        logs.add(log);
        System.out.println(log);
    }

    public ArrayList<String> getLogs() {
        return logs;
    }
}