import enums.Rarity;

public abstract class Item {
    private final String id;
    private final String name;
    private final int value;
    private final Rarity rarity;
    private final ItemType type;

    protected Item(String id, String name, int value, Rarity rarity, ItemType type) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.rarity = rarity;
        this.type = type;
    }

    public abstract void use();

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public int getValue() { return value; }
    public Rarity getRarity() { return rarity; }
    public ItemType getType() { return type; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id.equals(item.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}