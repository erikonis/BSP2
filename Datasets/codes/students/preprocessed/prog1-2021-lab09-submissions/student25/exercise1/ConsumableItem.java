public class ConsumableItem extends Item {

    private int charges;

    public ConsumableItem(int charges, String name, int value, Rarity rarity) {
        super(name, value, rarity);
        
        if (charges < 0) {
            charges = 0;
        }

        this.charges = charges;
    }
    
    @Override
    public int use() {
        if (charges > 0) {
            charges -= 1;
            System.out.println("Used the consumable item " + getName() + ". (" + charges + " charges left)");
        } else {
            System.out.println("The consumable item " + getName() + " has no charges left.");
        }
        return charges;
    }

    //use method from inventory does not output anythng to the terminal
    @Override
    public int useInventory() {
        if (charges > 0) {
            charges -= 1;
        }
        return charges;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + charges + " charges";
    }
    
}
