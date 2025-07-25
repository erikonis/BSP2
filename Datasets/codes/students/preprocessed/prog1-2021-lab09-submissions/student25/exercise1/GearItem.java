public class GearItem extends Item {

    private int criticalHit;
    private int determination;
    private int directHit;

    public GearItem(int criticalHit, int determination, int directHit, String name, int value, Rarity rarity) {
        super(name, value, rarity);
        
        if (criticalHit < 0) {
            criticalHit = 0;
        }

        if (determination < 0) {
            determination = 0;
        }

        if (directHit < 0) {
            directHit = 0;
        }

        this.criticalHit = criticalHit;
        this.determination = determination;
        this.directHit = directHit;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + criticalHit + " Critical Hit / " + determination + " Determination / " + directHit + " Direct Hit";
    }
    
}
