public class ConsumableItem extends Item {

    private int charge;

    public ConsumableItem(String name, int value, Rarity rarity, int charge) {
        super(name, value, rarity);
        this.charge = charge;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    @Override
    public void use() {
        charge--;
        System.out.println("Used the consumable item " + getName() + ". (" + charge + " charges left)");
        if (charge == 0) {
            System.out.println("The consumable item Health Potion has no charges left.");
        }
        
    }

    @Override
    public String toString() {
        return super.toString() + " - " + charge + " charges";
    }

}
