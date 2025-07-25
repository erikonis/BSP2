public class TrashItem extends Item implements Sellable {
    private UsageStrategy usageStrategy;

    public TrashItem(String name, int value, Rarity rarity) {
        super(name, value, rarity);
        this.usageStrategy = new NoUsageStrategy();
    }

    @Override
    public void use(Inventory inventory) {
        this.usageStrategy.use(this, inventory);
    }

    @Override
    public String toString() {
        return "[Trash] " + super.toString();
    }
}