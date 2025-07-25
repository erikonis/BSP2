public class ConsumableItem extends Item {

    private int charges;

    public ConsumableItem(String name, int value, String rarity, int charges) {
        super(name, value, rarity);
        this.charges = charges;
    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }

   
           }
        

    


