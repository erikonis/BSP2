public class ConsumableItem extends Item {
    private int charges;

    public ConsumableItem(String id, String name, int value, Rarity rarity, int charges) {
        super(id, name, value, rarity, ItemType.CONSUMABLE);
        this.charges = validateCharges(charges);
    }

    @Override
    public void use(Player player) {
        BehaviorRegistry.getBehavior(ItemType.CONSUMABLE).onUse(this, player);
    }

    private int validateCharges(int charges) {
        if (charges < 0) {
            throw new IllegalArgumentException("Charges cannot be negative");
        }
        return charges;
    }
}