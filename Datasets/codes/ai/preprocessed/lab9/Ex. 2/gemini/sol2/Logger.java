import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Logger implements Consumer<GameEvent> {
    private static Logger instance;
    private List<String> logs;

    private Logger() {
        this.logs = new ArrayList<>();
        EventManager.getInstance().subscribe(this); // Subscribe to all game events
        System.out.println("Game Logger initialized and subscribed to events.");
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

    @Override
    public void accept(GameEvent event) {
        logs.add(event.getLogMessage());
    }

    public void printLogs() {
        System.out.println("\n--- Game Event Logs ---");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}