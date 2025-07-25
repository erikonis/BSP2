package exercise1;

public class GearItem extends Item {
    private int criticalHit, determination, directHit;

    public GearItem(String name, int value, Rarity rarity, int criticalHit, int directHit, int determination) throws Exception {
        super(name, value, rarity);
        if(criticalHit < 0 || determination < 0 ||directHit < 0){
            throw new Exception("Invalid value(s)");
        }
        this.criticalHit = criticalHit;
        this.determination = determination;
        this.directHit = directHit;
    }
    // missing exception

    public String toString() {
        return super.toString() + " - " + criticalHit + " Critical Hit / " + determination + " Determination / "
                + directHit + " Direct Hit";
    }

    @Override
    public int compareTo(Item i) {
        int sum = 0, sumO = 0;
        if (i instanceof GearItem) {
            GearItem o = (GearItem) i;
            sum = criticalHit + determination + directHit;
            sumO = o.criticalHit + o.determination + o.directHit;
        }
        if (sum > sumO) {
            return 1;
        } else if (sum < sumO) {
            return -1;
        } else {
            return 0;
        }

    }

}
