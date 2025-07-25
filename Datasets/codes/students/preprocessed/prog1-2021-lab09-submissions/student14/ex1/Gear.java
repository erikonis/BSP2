public class Gear extends Items {
    // hits
    private int critical;
    private int determination;
    private int direct;

    public Gear(String name, int value, int charge, Rarity rarity, int critical, int determination, int direct) {
        super(name, value, charge, rarity);
        this.critical = critical;
        this.determination = determination;
        this.direct = direct;
    }

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getDirect() {
        return direct;
    }

    // total
    public int total() {
        return critical + direct + determination;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    @Override
    public String toString() {
        return "Gear [critical=" + " " + critical + ", determination=" + " " + determination + ", direct=" + " "
                + direct + "]";
    }
}