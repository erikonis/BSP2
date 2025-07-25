public class GearItem extends AbstractItem {
    private int criticalHit;
    private int determination;
    private int directHit;

    public GearItem(String name, int value, Rarity rarity, int criticalHit, int determination, int directHit) {
        super(name, value, rarity);
        this.criticalHit = criticalHit;
        this.determination = determination;
        this.directHit = directHit;
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
    public void use() {
        System.out.println("Gear item " + getName() + " used.");
    }

    @Override
    public String toString() {
        return super.toString() + " GearItem{" +
                "criticalHit=" + criticalHit +
                ", determination=" + determination +
                ", directHit=" + directHit +
                '}';
    }
}
