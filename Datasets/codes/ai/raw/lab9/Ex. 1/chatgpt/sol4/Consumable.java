import java.util.Set;

public class Consumable implements Item {
    private final String name;
    private final int value;
    private final Rarity rarity;
    private int charges;

    public Consumable(String name, int value, Rarity rarity, int charges) {
        this.name = name;
        this.value = value;
        this.rarity = rarity;
        this.charges = charges;
    }

    public String name() { return name; }
    public int value() { return value; }
    public Rarity rarity() { return rarity; }
    public Set<String> tags() { return Set.of("consumable"); }

    public void use() {
        if (charges > 0) {
            charges--;
            System.out.println("Used " + name + ", remaining charges: " + charges);
        } else {
            System.out.println(name + " is empty.");
        }
    }

    public boolean isDepleted() {
        return charges <= 0;
    }

    @Override
    public String toString() {
        return name + " [Consumable x" + charges + ", " + rarity + "]";
    }
}
