import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;
    private int capacity;

    public Inventory(int capacity) {
        this.items = new ArrayList<>(capacity);
        this.capacity = capacity;
        System.out.println("Inventory created with a capacity of " + capacity + " slots.");
    }

    public boolean add(Item item) {
        if (items.size() < capacity) {
            items.add(item);
            System.out.println("Added item: " + item.getName() + " to the inventory.");
            return true;
        } else {
            System.out.println("Inventory is full. Cannot add " + item.getName() + ".");
            return false;
        }
    }

    public int drop(Item item) {
        int initialSize = items.size();
        items.removeIf(invItem -> invItem.equals(item));
        int removedCount = initialSize - items.size();
        if (removedCount > 0) {
            System.out.println("Dropped " + removedCount + " instance(s) of " + item.getName() + " from the inventory.");
        } else {
            System.out.println(item.getName() + " not found in the inventory.");
        }
        return removedCount;
    }

    public boolean drop(int index) {
        if (index >= 0 && index < items.size()) {
            Item removedItem = items.remove(index);
            System.out.println("Dropped item at index " + index + ": " + removedItem.getName());
            return true;
        } else {
            System.out.println("Invalid index: " + index + ". Cannot drop item.");
            return false;
        }
    }

    public void use(int index) {
        if (index >= 0 && index < items.size()) {
            Item item = items.get(index);
            System.out.print("Attempting to use item at index " + index + ": " + item.getName() + ". ");
            item.use();
            if (item instanceof ConsumableItem && ((ConsumableItem) item).getCharges() == 0) {
                items.remove(index);
                System.out.println(item.getName() + " has no charges left and was removed from the inventory.");
            }
        } else {
            System.out.println("Invalid index: " + index + ". Cannot use item.");
        }
    }

    public boolean sell(int index) {
        if (index >= 0 && index < items.size()) {
            Item item = items.get(index);
            if (item instanceof Sellable) {
                items.remove(index);
                System.out.println("Sold item at index " + index + ": " + item.getName());
                return true;
            } else {
                System.out.println("Cannot sell item at index " + index + ": " + item.getName() + " (not sellable).");
                return false;
            }
        } else {
            System.out.println("Invalid index: " + index + ". Cannot sell item.");
            return false;
        }
    }

    public void sort(String sortBy, String order) {
        InventorySorter.sort(this.items, sortBy, order);
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "Inventory is empty.";
        }
        StringBuilder sb = new StringBuilder("Inventory:\n");
        for (int i = 0; i < items.size(); i++) {
            sb.append("[").append(i).append("] ").append(items.get(i)).append("\n");
        }
        return sb.toString();
    }
}