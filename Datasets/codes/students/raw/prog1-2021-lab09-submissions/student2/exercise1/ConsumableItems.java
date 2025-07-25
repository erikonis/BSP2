package lu.uni.programming1.lab9.exercise1;

public class ConsumableItems extends Items {

    private int charges;
    
    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }

    public ConsumableItems(String itemName, int itemcost, Rarity rarity, int charges) {
        super(itemName, itemcost, rarity);
        this.charges=charges;
    }

    public void use(){
        if (charges >0) {
            charges--;
            System.out.println("Used the consumable item "+getItemName()+" Potion. ("+charges+" charges left");
        }
    }

    @Override
    public String toString() {
        return getRarity()+" "+getItemName()+" Potion ("+getItemcost()+" Gold) - "+charges+" charges";
    }
    
    
}
