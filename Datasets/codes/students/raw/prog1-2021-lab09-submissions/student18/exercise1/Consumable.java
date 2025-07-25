package lab9.exercise1;

public class Consumable extends Item{
    private int charge;

    public Consumable(String name, int value, Rarity rarity, int charge) {
        super(name, value, rarity);
        this.charge=charge;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public void use(){
        if(charge>0){
            charge--;
            System.out.println("Used the consumable item "+toString());
        }
        else{
            System.out.println("The consumable item "+super.getName()+" has no charges left.");
        }
    }

    @Override
    public String toString() {
        return super.toString()+" - ("+charge+" left)";
    }


    
}