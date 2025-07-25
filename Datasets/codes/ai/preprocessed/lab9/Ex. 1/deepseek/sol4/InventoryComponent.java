import ecs.Component;
import ecs.Entity;
import java.util.ArrayList;
import java.util.List;

public class InventoryComponent extends Component {
    private final int capacity;
    private final List<Entity> items;

    public InventoryComponent(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public boolean addItem(Entity item) {
        if (items.size() < capacity) {
            items.add(item);
            return true;
        }
        return false;
    }

    public List<Entity> getItems() { return items; }
    public int getCapacity() { return capacity; }
}