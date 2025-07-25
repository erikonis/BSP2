public class Consumable extends Item{
    private int charges;

    public Consumable(int charges, String name, int value, Rarity rarity)
    {
        super(name,value,rarity);
        this.charges=charges;
    }   

    @Override
    public boolean use() //returns true if consumed else returns false
    {

        if(charges>0)
        {
            charges--;
            System.out.println("Used the consumable item "+super.getName()+". ("+charges+" charges left)");
            return true;
        }
        else
        {
            System.out.println("The consumable item "+super.getName()+" has no charges left.");
            return false;
        }
    }

    @Override
    public String toString()
    {
        return super.toString()+"- "+charges+" charges";
    }

}
