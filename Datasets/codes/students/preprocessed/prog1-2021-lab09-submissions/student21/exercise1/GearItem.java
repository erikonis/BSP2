public class GearItem extends Item {
    private int criticalHit, determination, directHit;

    public GearItem(String name, int value, Rarity rarity, int criticalHit, int determination, int directHit) {
        super(name, value, rarity);
        this.criticalHit = criticalHit;
        this.determination = determination;
        this.directHit = directHit;
        if (criticalHit < 0) {
            System.out.println("Cannot be a negative critical hit, considering it as 0");
            this.criticalHit = 0;
        } 
        if (determination < 0) {
            System.out.println("Cannot be a negative determination, considering it as 0");
            this.determination = 0;
        } 
        if (directHit < 0) {
            System.out.println("Cannot be a negative direct hit, considering it as 0");
            this.directHit = 0;
        } 
    }

    // From super
    @Override
    public void use() {
        System.out.printf("The gear item %s cannot be used.\n", super.getName());

    }

    @Override
    public String toString() {
        return super.toString() + " - " + criticalHit + " Critical Hit / " + determination + " Determination / "
                + directHit + " Direct Hit";
    }

    @Override
    public int compareTo(Item o) {
        if (getClass() == o.getClass()) {
            GearItem other = (GearItem) o;
            int sum = criticalHit + determination + directHit;
            int otherSum = other.criticalHit + other.determination + other.directHit;
            return sum - otherSum;
            
        } else {
            return super.compareTo(o);
        }
    }
}
