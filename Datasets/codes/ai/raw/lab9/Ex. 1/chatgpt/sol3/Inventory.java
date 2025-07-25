import java.util.*;

public class Inventory {
    private final int capacity;
    private final List<Item> items;

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
        System.out.println("Inventory full.");
        return false;
    }

    public int drop(Item item) {
        int count = 0;
        Iterator<Item> it = items.iterator();
        while (it.hasNext()) {
            if (it.next().equals(item)) {
                it.remove();
                count++;
            }
        }
        System.out.println("Dropped " + count + " of " + item.getName());
        return count;
    }

    public boolean drop(int index) {
        if (index < 0 || index >= items.size()) return false;
        System.out.println("Dropped: " + items.remove(index));
        return true;
    }

    public void use(int index) {
        if (index < 0 || index >= items.size()) return;
        Item item = items.get(index);
        item.use();
        if (item.isDepleted()) {
            items.remove(index);
            System.out.println("Item removed after use: " + item.getName());
        }
    }

    public boolean sell(int index) {
        if (index < 0 || index >= items.size()) return false;
        Item item = items.get(index);
        if (item.isSellable()) {
            items.remove(index);
            System.out.println("Sold: " + item.getName());
            return true;
        }
        System.out.println("Cannot sell: " + item.getName());
        return false;
    }

    public void sort(Comparator<Item> comparator) {
        items.sort(comparator);
        System.out.println("Inventory sorted.");
    }

    public void print() {
        System.out.println("\n== Inventory ==");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("[" + i + "] " + items.get(i));
        }
    }
}
