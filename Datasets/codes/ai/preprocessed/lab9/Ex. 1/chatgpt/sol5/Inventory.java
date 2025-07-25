import java.util.*;

public class Inventory {
    private final int capacity;
    private final List<Item> items;

    public Inventory(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Capacity must be > 0");
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public boolean add(Item item) {
        if (items.size() < capacity) {
            items.add(item);
            return true;
        }
        return false;
    }

    public int drop(Item item) {
        int before = items.size();
        items.removeIf(i -> i.equals(item));
        return before - items.size();
    }

    public boolean drop(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            return true;
        }
        return false;
    }

    public void use(int index) {
        if (index >= 0 && index < items.size()) {
            Item item = items.get(index);
            item.use();
            if (item instanceof Consumable con && con.isDepleted()) {
                items.remove(index);
                System.out.println("Removed depleted item: " + con.getName());
            }
        }
    }

    public boolean sell(int index) {
        if (index >= 0 && index < items.size()) {
            Item item = items.get(index);
            if (item instanceof Sellable) {
                items.remove(index);
                System.out.println("Sold: " + item.getName());
                return true;
            }
        }
        return false;
    }

    public void print() {
        System.out.println("Inventory:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("[" + i + "] " + items.get(i));
        }
    }

    public void sortByName(boolean ascending) {
        items.sort(Comparator.comparing(Item::getName));
        if (!ascending) Collections.reverse(items);
    }

    public void sortByValue(boolean ascending) {
        items.sort(Comparator.comparingInt(Item::getValue));
        if (!ascending) Collections.reverse(items);
    }
}