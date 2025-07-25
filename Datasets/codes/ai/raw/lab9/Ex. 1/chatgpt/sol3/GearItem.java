public class GearItem implements Item {
    private final String name;
    private final int value;
    private final Rarity rarity;
    private final int crit, det, direct;

    public GearItem(String name, int value, Rarity rarity, int crit, int det, int direct) {
        this.name = name;
        this.value = value;
        this.rarity = rarity;
        this.crit = Math.max(0, crit);
        this.det = Math.max(0, det);
        this.direct = Math.max(0, direct);
    }

    public String getName() { return name; }
    public int getValue() { return value; }
    public Rarity getRarity() { return rarity; }

    public void use() {
        System.out.println("Equipped " + name + ": Crit=" + crit + ", Det=" + det + ", Direct=" + direct);
    }

    public int getPowerScore() {
        return crit + det + direct;
    }

    public boolean isDepleted() { return false; }
    public boolean isSellable() { return false; }

    @Override
    public String toString() {
        return name + " [Gear, Crit=" + crit + ", Det=" + det + ", Dir=" + direct + "]";
    }
}
