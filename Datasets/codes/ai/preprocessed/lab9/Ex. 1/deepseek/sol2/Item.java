public abstract class Item implements Comparable<Item> {
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

    // Getters
    public String getName() { return name; }
    public int getValue() { return value; }
    public Rarity getRarity() { return rarity; }
}