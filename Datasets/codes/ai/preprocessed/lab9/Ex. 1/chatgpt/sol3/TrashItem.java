public class TrashItem implements Item {
    private final String name;
    private final int value;
    private final Rarity rarity;

    public TrashItem(String name, int value, Rarity rarity) {
        this.name = name;
        this.value = value;
        this.rarity = rarity;
    }

    public String getName() { return name; }
    public int getValue() { return value; }
    public Rarity getRarity() { return rarity; }

    public void use() {
        System.out.println(name + " is completely useless.");
    }

    public boolean isDepleted() { return false; }
    public boolean isSellable() { return true; }

    @Override
    public String toString() {
        return name + " [Trash, " + rarity + "]";
    }
}