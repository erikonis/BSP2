import java.util.Objects;

public abstract class Item implements Comparable<Item> {
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

    // Now the use method in Item takes the Inventory as a parameter
    public abstract void use(Inventory inventory);
}