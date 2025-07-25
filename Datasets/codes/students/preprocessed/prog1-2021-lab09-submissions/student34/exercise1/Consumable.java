public class Consumable extends Item {

    private int charges;

    public Consumable(String name, int value, Rarity rarity, int charges) {
        this.name=name;
        this.value=value;
        this.rarity=rarity;
        this.charges=charges;

    }

    public int getCharges() {
        return charges;
    }

    public void Use() {
        if (charges>0) {
            charges--;
            System.out.println(name + " Used. " + charges + " charges remaining." + "\n");
        }
        else {
            System.out.println("No charges remaining." + "\n");
        }
    }

    @Override
    public String toString() {
        return "[" + rarity + "] " + name + " (" + value + " gold) " + " - " + charges + " charges"; 
    }
    
}
