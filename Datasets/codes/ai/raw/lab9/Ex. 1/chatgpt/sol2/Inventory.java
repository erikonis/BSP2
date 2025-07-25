import java.util.*;

public class Inventory {
    private final int capacity;
    private final LinkedList<Item> items;

    public Inventory(int capacity) {
        this.capacity = capacity;
        this.items = new LinkedList<>();
    }

    public boolean add(Item item) {
        if (items.size() >= capacity) {
            System.out.println("Inventory full. Can't add " + item.getName());
            return false;
        }
        items.add(item);
        System.out.println("Added: " + item);
        return true;
    }

    public int drop(Item item) {
        int count = 0;
        Iterator<Item> iter = items.iterator();
        while (iter.hasNext()) {
            if (iter.next().equals(item)) {
                iter.remove();
                count++;
            }
        }
        System.out.println("Dropped " + count + "x " + item.getName());
        return count;
    }

    public boolean drop(int index) {
        if (index < 0 || index >= items.size()) {
            System.out.println("Drop failed. Invalid index.");
            return false;
        }
        System.out.println("Dropped: " + items.remove(index));
        return true;
    }

    public void use(int index) {
        if (index < 0 || index >= items.size()) {
            System.out.println("Use failed. Invalid index.");
            return;
        }
        Item item = items.get(index);
        item.use();
        if (item instanceof ConsumableItem consumable && consumable.isDepleted()) {
            items.remove(index);
            System.out.println("Removed depleted " + consumable.getName());
        }
    }

    public boolean sell(int index) {
        if (index < 0 || index >= items.size()) {
            System.out.println("Sell failed. Invalid index.");
            return false;
        }
        Item item = items.get(index);
        if (item instanceof Sellable) {
            items.remove(index);
            System.out.println("Sold: " + item.getName());
            return true;
        }
        System.out.println(item.getName() + " cannot be sold.");
        return false;
    }

    public void sortByName(boolean ascending) {
        items.sort(Comparator.comparing(Item::getName));
        if (!ascending) Collections.reverse(items);
    }

    public void sortByValue(boolean ascending) {
        items.sort(Comparator.comparingInt(Item::getValue));
        if (!ascending) Collections.reverse(items);
    }

    public void printInventory() {
        System.out.println("\n=== Inventory ===");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("[" + i + "] " + items.get(i));
        }
    }
}
