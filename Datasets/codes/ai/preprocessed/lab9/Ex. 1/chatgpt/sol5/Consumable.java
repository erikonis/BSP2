public class Consumable extends Item implements Sellable {
    private int charges;

    public Consumable(String name, int value, Rarity rarity, int charges) {
        super(name, value, rarity);
        if (charges < 0) throw new IllegalArgumentException("Charges must be non-negative.");
        this.charges = charges;
    }

    public int getCharges() { return charges; }

    @Override
    public void use() {
        if (charges > 0) {
            charges--;
            System.out.println("Used " + getName() + ". Remaining charges: " + charges);
        } else {
            System.out.println(getName() + " is depleted.");
        }
    }

    public boolean isDepleted() {
        return charges == 0;
    }
}