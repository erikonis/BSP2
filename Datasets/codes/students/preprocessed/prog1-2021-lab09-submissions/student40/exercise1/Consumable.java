public class Consumable extends Item {
    private int charges;

    public Consumable(String name, int value, Rarity rarity, int charges) {
        super(name, value, rarity);
        this.charges = charges;
    }

    public int getCharges() {
        return charges;
    }

    public void increaseCharges(int newCharges) {
        charges += newCharges;
    }

    public void decreaseCharges() {
        charges--;
        if(charges < 0){
            charges = 0;
        };
    }

    @Override
    public void use() {
        if(charges == 0){
            System.out.println("The consumable item " + getName() + " has no charges left");
        }
        else {
            decreaseCharges();
            System.out.println(toString());
        }
        
    }

    @Override
    public String toString() {
        return super.toString() + "(" + getCharges() + " charges left) ";
    }
}
