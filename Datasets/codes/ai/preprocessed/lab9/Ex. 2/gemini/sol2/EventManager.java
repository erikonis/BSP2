import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class EventManager {
    private static EventManager instance;
    private List<Consumer<GameEvent>> listeners;

    private EventManager() {
        this.listeners = new ArrayList<>();
        System.out.println("Event Manager initialized.");
    }

    public static EventManager getInstance() {
        if (instance == null) {
            synchronized (EventManager.class) {
                if (instance == null) {
                    instance = new EventManager();
                }
            }
        }
        return instance;
    }

    public void subscribe(Consumer<GameEvent> listener) {
        if (listener != null) {
            this.listeners.add(listener);
        }
    }

    public void unsubscribe(Consumer<GameEvent> listener) {
        this.listeners.remove(listener);
    }

    public void publishEvent(GameEvent event) {
        for (Consumer<GameEvent> listener : listeners) {
            listener.accept(event);
        }
    }
}