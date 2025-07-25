public class ConsumableItem extends Item implements Sellable {
    private int charges;

    public ConsumableItem(String name, int value, Rarity rarity, int charges) {
        super(name, value, rarity);
        this.charges = Math.max(0, charges);
    }

    public int getCharges() {
        return charges;
    }

    @Override
    public void use() {
        if (charges > 0) {
            charges--;
            System.out.println("Used " + getName() + ". Charges remaining: " + charges);
        } else {
            System.out.println(getName() + " has no charges left.");
        }
    }

    @Override
    public String toString() {
        return "[Consumable] " + super.toString() + ", Charges: " + charges;
    }
}