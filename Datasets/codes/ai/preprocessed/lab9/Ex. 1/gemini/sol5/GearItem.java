public class GearItem extends Item {
    private int criticalHit;
    private int determination;
    private int directHit;
    private UsageStrategy usageStrategy;

    public GearItem(String name, int value, Rarity rarity, int criticalHit, int determination, int directHit) {
        super(name, value, rarity);
        this.criticalHit = Math.max(0, criticalHit);
        this.determination = Math.max(0, determination);
        this.directHit = Math.max(0, directHit);
        this.usageStrategy = new NoUsageStrategy(); // Gear items might not be directly usable
    }

    public int getCriticalHit() {
        return criticalHit;
    }

    public int getDetermination() {
        return determination;
    }

    public int getDirectHit() {
        return directHit;
    }

    @Override
    public void use(Inventory inventory) {
        this.usageStrategy.use(this, inventory);
    }

    @Override
    public String toString() {
        return "[Gear] " + super.toString() + ", Crit: " + criticalHit + ", Det: " + determination + ", Direct: " + directHit;
    }

    @Override
    public int compareTo(Item other) {
        if (other instanceof GearItem) {
            GearItem otherGear = (GearItem) other;
            int thisStats = this.criticalHit + this.determination + this.directHit;
            int otherStats = otherGear.getCriticalHit() + otherGear.getDetermination() + otherGear.getDirectHit();
            return Integer.compare(thisStats, otherStats);
        }
        return super.compareTo(other); // Compare by value if the other item is not Gear
    }
}