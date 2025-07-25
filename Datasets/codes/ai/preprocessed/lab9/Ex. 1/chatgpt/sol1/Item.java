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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return name.equals(item.name) && rarity == item.rarity;
    }

    @Override
    public int compareTo(Item other) {
        return Integer.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return name + " (Value: " + value + ", Rarity: " + rarity + ")";
    }
}