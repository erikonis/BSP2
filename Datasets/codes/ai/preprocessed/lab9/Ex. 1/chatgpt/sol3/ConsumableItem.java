public class ConsumableItem implements Item {
    private final String name;
    private final int value;
    private final Rarity rarity;
    private int charges;

    public ConsumableItem(String name, int value, Rarity rarity, int charges) {
        this.name = name;
        this.value = value;
        this.rarity = rarity;
        this.charges = charges;
    }

    public String getName() { return name; }
    public int getValue() { return value; }
    public Rarity getRarity() { return rarity; }

    public void use() {
        if (charges > 0) {
            charges--;
            System.out.println("Used " + name + ". Remaining charges: " + charges);
        } else {
            System.out.println(name + " has no charges left.");
        }
    }

    public boolean isDepleted() { return charges <= 0; }
    public boolean isSellable() { return true; }

    @Override
    public String toString() {
        return name + " [Consumable, " + rarity + ", Charges=" + charges + "]";
    }
}