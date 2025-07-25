import java.util.List;

public class Logger {
    private static Logger instance;
    private List<String> logs;

    private Logger() {
        this.logs = new java.util.ArrayList<>();
        System.out.println("Game Logger initialized.");
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(Effect effect, Character source, Character target) {
        logs.add(effect.log(source, target));
    }

    public void printLogs() {
        System.out.println("\n--- Game Event Logs ---");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}