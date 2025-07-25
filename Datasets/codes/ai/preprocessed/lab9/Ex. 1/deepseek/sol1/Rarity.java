import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Rarity enum
public enum Rarity {
    WHITE, PINK, GREEN, BLUE, PURPLE
}

// Marker interface for sellable items
interface Sellable {}

// Base Item class
abstract class Item implements Comparable<Item> {
    protected String name;
    protected int value;
    protected Rarity rarity;

    public Item(String name, int value, Rarity rarity) {
        this.name = name;
        this.value = value;
        this.rarity = rarity;
    }

    public abstract void use();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item other = (Item) obj;
        return name.equals(other.name) && rarity == other.rarity;
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + rarity.hashCode();
    }

    @Override
    public int compareTo(Item other) {
        return Integer.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return String.format("%s (Value: %d, Rarity: %s)", name, value, rarity);
    }
}

// Trash Item
class TrashItem extends Item implements Sellable {
    public TrashItem(String name, int value, Rarity rarity) {
        super(name, value, rarity);
    }

    @Override
    public void use() {
        System.out.println("You used " + name + " but nothing happened. It's trash after all.");
    }

    @Override
    public String toString() {
        return "[Trash] " + super.toString();
    }
}

// Gear Item
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

    @Override
    public void use() {
        System.out.printf("Equipped %s. Stats: CH: %d, DET: %d, DH: %d%n",
                         name, criticalHit, determination, directHit);
    }

    @Override
    public int compareTo(Item other) {
        if (other instanceof GearItem) {
            GearItem otherGear = (GearItem) other;
            int thisSum = this.criticalHit + this.determination + this.directHit;
            int otherSum = otherGear.criticalHit + otherGear.determination + otherGear.directHit;
            return Integer.compare(thisSum, otherSum);
        }
        return super.compareTo(other);
    }

    @Override
    public String toString() {
        return String.format("[Gear] %s (CH: %d, DET: %d, DH: %d)",
                           super.toString(), criticalHit, determination, directHit);
    }
}

// Consumable Item
class ConsumableItem extends Item implements Sellable {
    private int charges;

    public ConsumableItem(String name, int value, Rarity rarity, int charges) {
        super(name, value, rarity);
        this.charges = Math.max(0, charges);
    }

    @Override
    public void use() {
        if (charges > 0) {
            charges--;
            System.out.printf("Used %s. Charges left: %d%n", name, charges);
        } else {
            System.out.println(name + " has no charges left!");
        }
    }

    @Override
    public String toString() {
        return String.format("[Consumable] %s (Charges: %d)", super.toString(), charges);
    }

    public boolean hasCharges() {
        return charges > 0;
    }
}