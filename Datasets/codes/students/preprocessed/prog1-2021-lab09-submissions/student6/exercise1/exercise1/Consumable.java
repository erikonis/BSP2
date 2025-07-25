public class Consumable extends Item{
    private int charges;
    private Effect effect;

    public Consumable(String name, int value, Rarity rarity, int charges,Effect effect) {
        super(name, value, rarity);
        this.charges = charges;
        this.effect = effect;
    }

    public int getCharges() {
        return charges;
    }

    public Effect getEffect() {
        return effect;
    }

    public void use() {
        if(charges>0){
            charges--;
            System.out.println("Cosumanble used: "+charges+" charges left"); 	
        }
    }

    @Override
    public String toString() {
        return "["+super.getRarity()+"] "+super.getName()+" ("+super.getValue()+" coins) [charges=" + charges + ", effect=" + effect + "]";
    }
}
