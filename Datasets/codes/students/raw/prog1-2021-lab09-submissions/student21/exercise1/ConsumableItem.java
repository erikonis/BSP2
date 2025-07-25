package lu.uni.programming1.lab9.exercise1;

public class ConsumableItem extends Item implements Sellable, Usable {
    private int charges;

    public ConsumableItem(String name, int value, Rarity rarity, int charges) {
        super(name, value, rarity);
        if (charges > 0) {
            this.charges = charges;
        } else {
            System.out.println("Cannot be a negative charge amount, considering it as 0");
            this.charges = 0;
        }

    }

    // From usable
    @Override
    public int getCharges() {
        return charges;
    }

    // From super
    @Override
    public void use() {
        if (charges > 0) {
            System.out.printf("Used the consumable item %s. (%d charges left)\n", super.getName(), --charges);
        } else {
            System.out.printf("The consumable item %s has no charges left.\n", super.getName());
        }

    }

    @Override
    public String toString() {
        return super.toString() + " - " + charges + " charges";
    }

    // From sellable
    @Override
    public int getValue() {
        return super.getValue();
    }

}
