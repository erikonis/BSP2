public class GearItem extends Item {
    private int crit, det, direct;

    public GearItem(String name, int value, Rarity rarity, int crit, int det, int direct) {
        super(name, value, rarity);
        this.crit = Math.max(0, crit);
        this.det = Math.max(0, det);
        this.direct = Math.max(0, direct);
    }

    @Override
    public void use() {
        System.out.println("Equipping " + name + " with stats (Crit: " + crit + ", Det: " + det + ", Direct: " + direct + ")");
    }

    @Override
    public int compareTo(Item o) {
        if (o instanceof GearItem) {
            GearItem other = (GearItem) o;
            int sumThis = this.crit + this.det + this.direct;
            int sumOther = other.crit + other.det + other.direct;
            return Integer.compare(sumThis, sumOther);
        }
        return super.compareTo(o);
    }

    @Override
    public String toString() {
        return super.toString() + " [Gear: Crit=" + crit + ", Det=" + det + ", Direct=" + direct + "]";
    }
}
