public class ConsumableItem extends Item implements Sellable {
    private int charges;
    private UsageStrategy usageStrategy;

    public ConsumableItem(String name, int value, Rarity rarity, int charges) {
        super(name, value, rarity);
        this.charges = Math.max(0, charges);
        this.usageStrategy = new ConsumableUsageStrategy();
    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = Math.max(0, charges); // Sanity check
    }

    @Override
    public void use(Inventory inventory) {
        this.usageStrategy.use(this, inventory);
    }

    @Override
    public String toString() {
        return "[Consumable] " + super.toString() + ", Charges: " + charges;
    }
}