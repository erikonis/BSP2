import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

enum Rarity {
    WHITE, PINK, GREEN, BLUE, PURPLE
}

// Marker Interface for Sellable Items
interface Sellable {
}

abstract class Item implements Comparable<Item> {
    private String name;
    private int value;
    private Rarity rarity;

    public Item(String name, int value, Rarity rarity) {
        this.name = name;
        this.value = value;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public Rarity getRarity() {
        return rarity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item other = (Item) obj;
        return Objects.equals(name, other.name) && rarity == other.rarity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rarity);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Value: " + value + ", Rarity: " + rarity;
    }

    @Override
    public int compareTo(Item other) {
        return Integer.compare(this.value, other.value);
    }

    // Abstract use method (can be overridden by subclasses)
    public void use() {
        System.out.println("This item cannot be used directly.");
    }
}

class TrashItem extends Item implements Sellable {
    public TrashItem(String name, int value, Rarity rarity) {
        super(name, value, rarity);
    }

    @Override
    public String toString() {
        return "[Trash] " + super.toString();
    }
}

class GearItem extends Item {
    private int criticalHit;
    private int determination;
    private int directHit;

    public GearItem(String name, int value, Rarity rarity, int criticalHit, int determination, int directHit) {
        super(name, value, rarity);
        this.criticalHit = Math.max(0, criticalHit);
        this.determination = Math.max(0, determination);
        this.directHit = Math.max(0, directHit);
    }

    public int getCriticalHit() {
        return criticalHit;
    }

    public int getDetermination() {
        return determination;
    }

    public int getDirectHit() {
        return directHit;
    }

    @Override
    public String toString() {
        return "[Gear] " + super.toString() + ", Crit: " + criticalHit + ", Det: " + determination + ", Direct: " + directHit;
    }

    @Override
    public int compareTo(Item other) {
        if (other instanceof GearItem) {
            GearItem otherGear = (GearItem) other;
            int thisStats = this.criticalHit + this.determination + this.directHit;
            int otherStats = otherGear.getCriticalHit() + otherGear.getDetermination() + otherGear.getDirectHit();
            return Integer.compare(thisStats, otherStats);
        }
        return super.compareTo(other); // Compare by value if the other item is not Gear
    }
}

class ConsumableItem extends Item implements Sellable {
    private int charges;

    public ConsumableItem(String name, int value, Rarity rarity, int charges) {
        super(name, value, rarity);
        this.charges = Math.max(0, charges);
    }

    public int getCharges() {
        return charges;
    }

    public void use() {
        if (charges > 0) {
            charges--;
            System.out.println("Used " + getName() + ". Charges remaining: " + charges);
        } else {
            System.out.println(getName() + " has no charges left.");
        }
    }

    @Override
    public String toString() {
        return "[Consumable] " + super.toString() + ", Charges: " + charges;
    }
}

class Inventory {
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
        Comparator<Item> comparator = null;
        switch (sortBy.toLowerCase()) {
            case "name":
                comparator = Comparator.comparing(Item::getName);
                break;
            case "value":
                comparator = Comparator.comparingInt(Item::getValue);
                break;
            default:
                System.out.println("Invalid sort criteria: " + sortBy + ". Sorting by default (value).");
                comparator = Comparator.comparingInt(Item::getValue);
                break;
        }

        if (order.equalsIgnoreCase("descending")) {
            comparator = comparator.reversed();
        } else if (!order.equalsIgnoreCase("ascending")) {
            System.out.println("Invalid sort order: " + order + ". Using ascending order.");
        }

        items.sort(comparator);
        System.out.println("Inventory sorted by " + sortBy.toLowerCase() + " in " + order.toLowerCase() + " order.");
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

public class FinalFantasyInventory {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(5);

        GearItem helmet = new GearItem("Iron Helmet", 50, Rarity.GREEN, 5, 4, 2);
        ConsumableItem potion = new ConsumableItem("Potion", 10, Rarity.WHITE, 3);
        TrashItem rock = new TrashItem("Pebble", 1, Rarity.WHITE);
        ConsumableItem ether = new ConsumableItem("Ether", 25, Rarity.GREEN, 2);
        GearItem sword = new GearItem("Bronze Sword", 100, Rarity.BLUE, 10, 0, 5);
        TrashItem feather = new TrashItem("Chocobo Feather", 2, Rarity.PINK);
        ConsumableItem antidote = new ConsumableItem("Antidote", 15, Rarity.WHITE, 5);

        inventory.add(helmet);
        inventory.add(potion);
        inventory.add(rock);
        inventory.add(ether);
        inventory.add(sword);
        inventory.add(feather); // Inventory full

        System.out.println("\n--- Initial Inventory ---");
        System.out.println(inventory);

        inventory.use(1); // Use potion
        inventory.use(1); // Use potion again
        inventory.use(1); // Use potion again
        inventory.use(1); // Try to use potion with no charges

        System.out.println("\n--- Inventory after using potion ---");
        System.out.println(inventory);

        inventory.drop(rock);
        inventory.drop(new TrashItem("Chocobo Feather", 2, Rarity.PINK)); // Try to drop by item

        System.out.println("\n--- Inventory after dropping items ---");
        System.out.println(inventory);

        inventory.sell(0); // Sell helmet (not sellable)
        inventory.sell(1); // Sell ether
        inventory.sell(0); // Sell potion (no charges left, should be at index 0 now)

        System.out.println("\n--- Inventory after selling items ---");
        System.out.println(inventory);

        inventory.sort("name", "ascending");
        System.out.println("\n--- Inventory sorted by name (ascending) ---");
        System.out.println(inventory);

        inventory.add(rock);
        inventory.add(feather);

        inventory.sort("value", "descending");
        System.out.println("\n--- Inventory sorted by value (descending) ---");
        System.out.println(inventory);

        inventory.sort("rarity", "ascending"); // Invalid sort criteria
        inventory.sort("name", "random");    // Invalid sort order

        System.out.println("\n--- Final Inventory ---");
        System.out.println(inventory);
    }
}