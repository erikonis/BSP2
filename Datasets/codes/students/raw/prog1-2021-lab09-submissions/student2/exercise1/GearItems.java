package lu.uni.programming1.lab9.exercise1;

public class GearItems extends Items {
    private int criticalHit;
    private int determination;
    private int directHit;

    public GearItems(String itemName, int itemcost, Rarity rarity, int criticalHit, int determination, int directHit) {
        super(itemName, itemcost, rarity);
        this.criticalHit=criticalHit;
        this.determination=determination;
        this.directHit=directHit;
    }

    @Override
    public String toString() {
        return getRarity()+" "+getItemName()+" ("+getItemcost()+" Gold) - "+criticalHit+" Critical Hit / "+determination+" Determination / "+directHit+" Direct Hit";
    }
    
    
}
