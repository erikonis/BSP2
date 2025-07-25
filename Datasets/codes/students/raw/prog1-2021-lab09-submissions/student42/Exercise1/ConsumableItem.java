package lu.uni.programming1.lab9.Exercise1;

public class ConsumableItem extends Item{
  
    private int charges;
   
    public ConsumableItem(String name, int value, Rarity rarity, int charges) {
        super(name, value, rarity);
        this.charges= charges;
    
    }
    public ConsumableItem(String name, int value, Rarity rarity) {
        super(name, value, rarity);
        this.charges= 1;
    
    }
    public void use()
    {
    charges--;

    }

    

    public int getCharges() {
        return charges;
    }


    @Override
    public String toString() {
        return super.toString()+" - "+charges+" charges";
    }
}
