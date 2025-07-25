/**
 * GearItem
 */
public class Gear extends Item {

    private int criticalHit;
    private int determination;
    private int directHit;

    public Gear(String name, int value, Rarity rarity, int criticalHit, int determination, int directHit)
    {
        super(name, value, rarity);

        criticalHit = Math.abs(criticalHit);
        determination = Math.abs(determination);
        directHit = Math.abs(directHit);
    }
    
    @Override
    public String toString()
    {
        return super.toString()+"- "+criticalHit+" Critical Hit / "+determination+" Determination / "+directHit+" Direct Hit";
    }
}