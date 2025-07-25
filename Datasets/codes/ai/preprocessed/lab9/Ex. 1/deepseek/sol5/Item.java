public abstract class Item implements Comparable<Item> {
    private final String id;
    private String name;
    private int value;
    private Rarity rarity;
    private ItemType type;

    protected Item(String id, String name, int value, Rarity rarity, ItemType type) {
        this.id = Objects.requireNonNull(id, "Item ID cannot be null");
        this.name = sanitizeName(name);
        this.value = validateValue(value);
        this.rarity = Objects.requireNonNull(rarity, "Rarity cannot be null");
        this.type = Objects.requireNonNull(type, "Item type cannot be null");
    }

    // Abstract method for item usage
    public abstract void use(Player player);

    // Getters with proper encapsulation
    public final String getId() { return id; }
    public final String getName() { return name; }
    public final int getValue() { return value; }
    public final Rarity getRarity() { return rarity; }
    public final ItemType getType() { return type; }

    // Protected setters for subclasses
    protected final void setName(String name) {
        this.name = sanitizeName(name);
    }

    protected final void setValue(int value) {
        this.value = validateValue(value);
    }

    // Validation methods
    private String sanitizeName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be empty");
        }
        return name.trim();
    }

    private int validateValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Item value cannot be negative");
        }
        return value;
    }

    // Equality and comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return id.equals(item.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public int compareTo(Item other) {
        return Integer.compare(this.value, other.value);
    }
}