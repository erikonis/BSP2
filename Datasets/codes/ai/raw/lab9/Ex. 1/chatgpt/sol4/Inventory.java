import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Inventory {
    private final int capacity;
    private final List<Item> items = new ArrayList<>();

    public Inventory(int capacity) {
        this.capacity = capacity;
    }

    public boolean add(Item item) {
        if (items.size() < capacity) {
            items.add(item);
            return true;
        }
        System.out.println("Inventory full.");
        return false;
    }

    public void use(int index) {
        if (index >= 0 && index < items.size()) {
            Item item = items.get(index);
            item.use();
            if (item instanceof Consumable con && con.isDepleted()) {
                items.remove(index);
                System.out.println("Depleted and removed: " + con.name());
            }
        }
    }

    public void dropIf(Predicate<Item> condition) {
        List<Item> toRemove = items.stream().filter(condition).collect(Collectors.toList());
        items.removeAll(toRemove);
        toRemove.forEach(i -> System.out.println("Dropped: " + i.name()));
    }

    public void sellAllSellable() {
        Predicate<Item> sellable = i -> i.is("trash") || i.is("consumable");
        dropIf(sellable);
    }

    public void sort(Comparator<Item> comparator) {
        items.sort(comparator);
    }

    public void print() {
        System.out.println("Inventory:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("[" + i + "] " + items.get(i));
        }
    }

    public List<Item> filter(Predicate<Item> filter) {
        return items.stream().filter(filter).toList();
    }
}
