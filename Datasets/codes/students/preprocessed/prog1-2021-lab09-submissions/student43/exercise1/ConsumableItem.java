
public class ConsumableItem extends Item {
    private int charges;

    public ConsumableItem(String name, int value, Rarity rarity, int charges) {
        super(name, value, rarity);
        this.charges = charges;
    }

    public boolean checkCharges() {
        if (charges == 0) {
            return false;
        } else {
            return true;
        }
    }

    public String use(){
        if(checkCharges()){
            charges--;
            return "Used the consumable item "+ getName()+". ("+charges+(charges==1?" charge":" charges")+" left)";
        }
        else{
            return "The consumable item "+getName()+" has no charges left.";
        }
    }
}
