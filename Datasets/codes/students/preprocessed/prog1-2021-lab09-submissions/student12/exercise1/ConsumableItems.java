public class ConsumableItems extends Item {

    private int charges;

    public ConsumableItems(String name, int value, Rarity rarity, int charges) {
        super(name, value, rarity);
        this.setCharges(charges);
    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }

    @Override
    public void use(Item item) {
        charges--;
        System.out.println("Used the consumable item "+item.getName()+" ("+charges+" charges left)\n");
        
    }
    
    public String toString() {
        return "["+getRarity()+"] "+getName()+" ("+getValue()+
        " Gold) - "+getCharges()+" charge(s)";
    }

}
