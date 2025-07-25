package lu.uni.programming1.lab9.exercise1;

public class Consumable extends Items implements Usable, Sellable{

    private int charge;

    public Consumable(String name, int value, Rarity rarity, int charge){
        super(name, value, rarity);
        this.charge = charge;
    }

    public void use(){
        charge--;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    @Override
    public String toString(){
        return "[" + getRarity() + "] " + getName() + " (" + getValue() + ") - " + getCharge() + " charges";
    }

}
