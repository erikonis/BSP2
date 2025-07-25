package exercise1;

public class Gear extends Items {

    private int criticalHit;
    private int determination;
    private int directHit;

    public Gear(String name, int cost, String rarity, int criticalHit, int determination, int directHit) {
        super(name, cost, rarity);
        this.criticalHit = Math.max(0, criticalHit);
        this.determination = Math.max(0, determination);
        this.directHit = Math.max(0, directHit);
    }

    @Override
    public String toString() {
        return super.toString() + " - " + criticalHit + " Critical Hit / " + determination + " Determination / "
                + directHit + " Direct Hit\n";
    }

}
