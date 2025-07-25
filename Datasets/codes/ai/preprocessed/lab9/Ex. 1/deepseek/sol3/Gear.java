import enums.Rarity;
import model.items.Item;
import model.items.ItemType;

public class Gear extends Item {
    private final GearStats stats;

    public Gear(String id, String name, int value, Rarity rarity, GearStats stats) {
        super(id, name, value, rarity, ItemType.GEAR);
        this.stats = stats;
    }

    @Override
    public void use() {
        System.out.printf("Equipped %s. Stats: CH: %d, DET: %d, DH: %d%n",
                getName(), stats.criticalHit(), stats.determination(), stats.directHit());
    }

    public GearStats getStats() {
        return stats;
    }

    @Override
    public String toString() {
        return String.format("[Gear] %s (Value: %d, Rarity: %s, Stats: CH %d/DET %d/DH %d)",
                getName(), getValue(), getRarity().getDisplayName(),
                stats.criticalHit(), stats.determination(), stats.directHit());
    }
}