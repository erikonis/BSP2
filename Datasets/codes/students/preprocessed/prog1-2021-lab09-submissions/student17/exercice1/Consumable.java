public class Consumable extends Item{
    int charges;

    Consumable(String name, int value, int charges, Rarity rarity) {
        super(name, value, rarity);
        this.charges = charges;
    }


    public int getCharges() {
        return charges;
    }
    public void setCharges(int charges) {
        this.charges = charges;
    }

    void use(){
        if (charges != 0) {
            charges--;
        System.out.print("Used the consumable item: ");
        System.out.println(this);
        }
        else{
            System.out.printf("The consumable item %s has no charges left ", getName());
        }
    }

    @Override
    public String toString() {
        return String.format("[%s]", getRarity())
        + String.format(" %s ", getName())
        + String.format(" (%s) Gold ", getValue())
        + String.format(" (%d) charges", getCharges());
    }
}
