public abstract class Item {
    private final String name;
    private final int value;
    private final Rarity rarity;

    public Item(String name, int value, Rarity rarity) {
        this.name = name;
        this.value = value;
        this.rarity = rarity;
    }

    public abstract void use();

    public String getName() { return name; }
    public int getValue() { return value; }
    public Rarity getRarity() { return rarity; }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Item other) {
            return name.equals(other.name) && rarity == other.rarity;
        }
        return false;
    }

    @Override
    public String toString() {
        return name + " (Value: " + value + ", Rarity: " + rarity + ")";
    }
}
