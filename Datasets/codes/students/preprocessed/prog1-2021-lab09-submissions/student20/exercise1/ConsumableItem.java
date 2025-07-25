public class ConsumableItem extends Item{
    private int charges;

    public ConsumableItem(String name, int cost, String rarity, int charges) {
        super(name, cost, rarity);
        if(charges > 0){
            this.charges = charges;
        }
    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }

    public void use(){
        setCharges(getCharges()-1);
        System.out.println("Used the consumable item " + getName() + ". (" + getCharges() + " charges left)");
        if(getCharges() == 0){
            System.out.println("The consumable item " + getName() + " has no charges left.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " - " + getCharges() + " charge(s)";
    }
    
}
