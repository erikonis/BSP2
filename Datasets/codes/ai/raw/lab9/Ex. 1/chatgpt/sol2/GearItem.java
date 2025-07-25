public class GearItem extends Item {
    private final int crit, det, direct;

    public GearItem(String name, int value, Rarity rarity, int crit, int det, int direct) {
        super(name, value, rarity);
        this.crit = Math.max(0, crit);
        this.det = Math.max(0, det);
        this.direct = Math.max(0, direct);
    }

    public int getPower() {
        return crit + det + direct;
    }

    @Override
    public void use() {
        System.out.println("Equipped " + getName() + " with stats: Crit=" + crit + ", Det=" + det + ", Direct=" + direct);
    }

    @Override
    public String toString() {
        return getName() + " [Gear, Crit=" + crit + ", Det=" + det + ", Direct=" + direct + ", Rarity=" + getRarity() + "]";
    }
}
