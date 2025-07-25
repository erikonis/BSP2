public class ItemConsumable extends Item implements Sellable{

    private int charges=0;

    public ItemConsumable(String name, int value, Rarity rarity, int charges) {
        super(name, value, rarity);
        this.charges = charges;
    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }

    @Override
    public String toString() {
        return "["+ rarity +"]" + name + "(" + value + " Gold) - " + charges + " charges" ;
    }
    
}
