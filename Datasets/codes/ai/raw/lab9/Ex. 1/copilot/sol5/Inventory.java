import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;
    private int capacity;

    public Inventory(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public boolean add(Item item) {
        if (items.size() < capacity) {
            items.add(item);
            System.out.println("Added " + item.getName() + " to inventory.");
            return true;
        } else {
            System.out.println("Inventory is full. Cannot add " + item.getName() + ".");
            return false;
        }
    }

    public int drop(Item item) {
        int count = 0;
        while (items.remove(item)) {
            count++;
        }
        System.out.println("Removed " + count + " instances of " + item.getName() + " from inventory.");
        return count;
    }

    public boolean drop(int index) {
        if (index >= 0 && index < items.size()) {
            Item removedItem = items.remove(index);
            System.out.println("Removed " + removedItem.getName() + " from inventory.");
            return true;
        } else {
            System.out.println("Invalid index. Cannot remove item.");
            return false;
        }
    }

    public void use(int index) {
        if (index >= 0 && index < items.size()) {
            Item item = items.get(index);
            item.use();
            if (item instanceof ConsumableItem) {
                ConsumableItem consumableItem = (ConsumableItem) item;
                if (consumableItem.getCharges() == 0) {
                    items.remove(index);
                    System.out.println("Removed " + consumableItem.getName() + " from inventory as it has no charges left.");
                }
            }
        } else {
            System.out.println("Invalid index. Cannot use item.");
        }
    }

    public boolean sell(int index) {
        if (index >= 0 && index < items.size()) {
            Item item = items.get(index);
            if (item instanceof TrashItem || item instanceof ConsumableItem) {
                items.remove(index);
                System.out.println("Sold " + item.getName() + ".");
                return true;
            } else {
                System.out.println(item.getName() + " cannot be sold.");
                return false;
            }
        } else {
            System.out.println("Invalid index. Cannot sell item.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "items=" + items +
                ", capacity=" + capacity +
                '}';
    }
}
