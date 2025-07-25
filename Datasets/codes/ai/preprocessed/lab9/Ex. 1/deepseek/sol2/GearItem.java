public class GearItem extends Item {
    private int criticalHit;
    private int determination;
    private int directHit;

    public GearItem(String name, int value, Rarity rarity, int criticalHit, int determination, int directHit) {
        super(name, value, rarity);
        this.criticalHit = Math.max(0, criticalHit);
        this.determination = Math.max(0, determination);
        this.directHit = Math.max(0, directHit);
    }

    @Override
    public void use() {
        System.out.printf("Equipped %s. Stats: CH: %d, DET: %d, DH: %d%n",
                         name, criticalHit, determination, directHit);
    }

    @Override
    public int compareTo(Item other) {
        if (other instanceof GearItem) {
            GearItem otherGear = (GearItem) other;
            int thisSum = this.criticalHit + this.determination + this.directHit;
            int otherSum = otherGear.criticalHit + otherGear.determination + otherGear.directHit;
            return Integer.compare(thisSum, otherSum);
        }
        return super.compareTo(other);
    }

    @Override
    public String toString() {
        return String.format("[Gear] %s (CH: %d, DET: %d, DH: %d)",
                           super.toString(), criticalHit, determination, directHit);
    }

    // Getters for stats
    public int getCriticalHit() { return criticalHit; }
    public int getDetermination() { return determination; }
    public int getDirectHit() { return directHit; }
}