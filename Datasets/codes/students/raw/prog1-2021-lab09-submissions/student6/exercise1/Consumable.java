package exercise1;

public class Consumable extends Item{
    private int charges;

    public Consumable(String name, int value, Rarity rarity, int charges) {
        super(name, value, rarity);
        this.charges = charges;
    }

    public int getCharges() {
        return charges;
    }

    public void use() {
        if(charges>0){
            charges--;
            System.out.println("Cosumanble used: "+charges+" charges left"); 	
        }
    }
}
