public class Consumable extends Items {

    private int charges;

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }

    public Consumable(String name, int cost, Rarity rarity, int charges) {
        super(name, cost, rarity);
        this.charges = charges;

    }

    @Override
    void use(Items item) {
        if (getCharges() != 0) {
            charges--;
            System.out.println("Used the consumable item " + getName() + ". (" + getCharges() + " charges left)");
        } else {
            System.out.println("The consumable item " + getName() + " has no more charges left.");
        }

    }

    @Override
    public String toString() {
        return "[" + getRarity() + "] " + getName() + " (" + getCost() + " Gold) - " + getCharges() + " charges";
    }

}
