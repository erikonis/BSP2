public class ConsumableItem extends Item implements Sellable {
    private int charges;

    public ConsumableItem(String name, int value, Rarity rarity, int charges) {
        super(name, value, rarity);
        this.charges = charges;
    }

    @Override
    public void use() {
        if (charges > 0) {
            charges--;
            System.out.println("Used " + name + ". Remaining charges: " + charges);
        } else {
            System.out.println(name + " has no charges left.");
        }
    }

    public boolean isDepleted() {
        return charges <= 0;
    }

    @Override
    public String toString() {
        return super.toString() + " [Consumable: Charges=" + charges + "]";
    }
}