import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class EventManager {
    private static EventManager instance;
    private Map<Class<? extends Event>, Consumer<Event>> handlers = new HashMap<>();

    private EventManager() {
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

    public <T extends Event> void registerHandler(Class<T> eventType, EventHandler<T> handler) {
        handlers.put(eventType, (Event event) -> handler.handle((T) event));
    }

    public void dispatch(Event event) {
        Consumer<Event> handler = handlers.get(event.getClass());
        if (handler != null) {
            handler.accept(event);
        }
    }
}