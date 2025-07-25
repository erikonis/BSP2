

public class Gear extends Item {
    private int criticalhit;
    private int determination;
    private int directhit;
    public Gear(String name,int value, String itemrarity, int criticalhit, int determination, int directhit) {
        super(name, value, itemrarity);
        this.criticalhit = Math.max(0, criticalhit);
        this.determination = Math.max(0, determination);
        this.directhit = Math.max(0, directhit);
    }
    
    public int compareTogears(Gear gear)
    {
        return (criticalhit+determination+directhit)-(gear.criticalhit+gear.determination+gear.directhit);
    }

    @Override
    public String toString() {
        return super.toString()+"- "+criticalhit+" Critical Hit / "+determination+" Determination / "+directhit+" Direct Hit";

    }
    public boolean use()
    {
        String name= super.getName();
        System.out.println(" The gear item "+name+" cannot be used.");
        return true;
    }
    


    
}
