public class Gear extends Item {
    private final int crit, det, direct;

    public Gear(String name, int value, Rarity rarity, int crit, int det, int direct) {
        super(name, value, rarity);
        if (crit < 0 || det < 0 || direct < 0)
            throw new IllegalArgumentException("Gear stats must be non-negative.");
        this.crit = crit;
        this.det = det;
        this.direct = direct;
    }

    public int getCrit() { return crit; }
    public int getDet() { return det; }
    public int getDirect() { return direct; }

    public int getTotalStats() { return crit + det + direct; }

    @Override
    public void use() {
        System.out.println("You equip " + getName() + ". Boosts: Crit=" + crit + ", Det=" + det + ", Direct=" + direct);
    }

    @Override
    public int compareTo(Item other) {
        if (other instanceof Gear g)
            return Integer.compare(this.getTotalStats(), g.getTotalStats());
        return super.compareTo(other);
    }
}