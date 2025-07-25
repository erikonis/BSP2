package items;

public class ConsumableItem extends Item implements Sellable {
    private int charges;

    public ConsumableItem(String name, int value, Rarity rarity, int charges) {
        super(name, value, rarity);
        this.charges = Math.max(0, charges);
    }

    @Override
    public void use() {
        if (charges > 0) {
            charges--;
            System.out.printf("Used %s. Charges left: %d%n", name, charges);
        } else {
            System.out.println(name + " has no charges left!");
        }
    }

    @Override
    public String toString() {
        return String.format("[Consumable] %s (Charges: %d)", super.toString(), charges);
    }

    public boolean hasCharges() {
        return charges > 0;
    }

    public int getCharges() { return charges; }
}