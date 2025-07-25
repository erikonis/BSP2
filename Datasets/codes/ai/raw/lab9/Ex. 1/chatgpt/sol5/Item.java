import java.util.Objects;

public abstract class Item implements Comparable<Item> {
    private final String name;
    private final int value;
    private final Rarity rarity;

    public Item(String name, int value, Rarity rarity) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Invalid name.");
        if (value < 0) throw new IllegalArgumentException("Value cannot be negative.");
        this.name = name;
        this.value = value;
        this.rarity = Objects.requireNonNull(rarity);
    }

    public String getName() { return name; }
    public int getValue() { return value; }
    public Rarity getRarity() { return rarity; }

    public abstract void use();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Item other)) return false;
        return name.equals(other.name) && rarity == other.rarity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rarity);
    }

    @Override
    public int compareTo(Item other) {
        return Integer.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return name + " [" + rarity + ", value=" + value + "]";
    }
}
