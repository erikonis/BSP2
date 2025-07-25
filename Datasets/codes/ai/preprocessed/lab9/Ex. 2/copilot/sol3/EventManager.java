import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private static EventManager instance;
    private List<EventListener> listeners;

    private EventManager() {
        listeners = new ArrayList<>();
    }

    public static EventManager getInstance() {
        if (instance == null) {
            instance = new EventManager();
        }
        return instance;
    }

    public void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    public void notify(Event event) {
        for (EventListener listener : listeners) {
            listener.update(event);
        }
    }
}