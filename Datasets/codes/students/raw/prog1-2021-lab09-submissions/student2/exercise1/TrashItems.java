package lu.uni.programming1.lab9.exercise1;

public class TrashItems extends Items{

    public TrashItems(String itemName, int itemcost, Rarity rarity) {
        super(itemName, itemcost, rarity);
        
    }

    @Override
    public String toString() {
        return getRarity()+" "+getItemName()+" ("+getItemcost()+" Gold)";
    }
    

    
}
