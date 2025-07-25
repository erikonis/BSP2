public class GearItem extends Item {
    private final GearStats stats;

    public GearItem(String id, String name, int value, Rarity rarity, GearStats stats) {
        super(id, name, value, rarity, ItemType.GEAR);
        this.stats = Objects.requireNonNull(stats, "Gear stats cannot be null");
    }

    @Override
    public void use(Player player) {
        BehaviorRegistry.getBehavior(ItemType.GEAR).onUse(this, player);
    }

    public GearStats getStats() {
        return stats;
    }
}