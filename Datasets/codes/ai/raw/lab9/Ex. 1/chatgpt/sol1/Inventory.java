import java.util.*;

public class Inventory {
    private List<Item> items;
    private final int capacity;

    public Inventory(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public boolean add(Item item) {
        if (items.size() < capacity) {
            items.add(item);
            System.out.println("Added: " + item);
            return true;
        }
        System.out.println("Inventory full! Could not add " + item);
        return false;
    }

    public int drop(Item item) {
        int originalSize = items.size();
        items.removeIf(i -> i.equals(item));
        int removed = originalSize - items.size();
        System.out.println("Dropped " + removed + " instance(s) of " + item.name);
        return removed;
    }

    public boolean drop(int index) {
        if (index >= 0 && index < items.size()) {
            System.out.println("Dropped: " + items.remove(index));
            return true;
        }
        System.out.println("Invalid index for drop.");
        return false;
    }

    public void use(int index) {
        if (index >= 0 && index < items.size()) {
            Item item = items.get(index);
            item.use();
            if (item instanceof ConsumableItem && ((ConsumableItem) item).isDepleted()) {
                items.remove(index);
                System.out.println(item.name + " removed from inventory after use.");
            }
        } else {
            System.out.println("Invalid index for use.");
        }
    }

    public boolean sell(int index) {
        if (index >= 0 && index < items.size()) {
            Item item = items.get(index);
            if (item instanceof Sellable) {
                items.remove(index);
                System.out.println("Sold: " + item.name);
                return true;
            } else {
                System.out.println(item.name + " cannot be sold.");
            }
        }
        return false;
    }

    public void printInventory() {
        System.out.println("\nInventory:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("[" + i + "] " + items.get(i));
        }
    }

    // BONUS: Sort
    public void sortByName(boolean ascending) {
        items.sort(Comparator.comparing(item -> item.name));
        if (!ascending) Collections.reverse(items);
    }

    public void sortByValue(boolean ascending) {
        items.sort(Comparator.comparingInt(item -> item.value));
        if (!ascending) Collections.reverse(items);
    }
}
