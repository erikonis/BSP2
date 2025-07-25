import enums.Rarity;
import model.items.Item;
import model.items.ItemType;

public class Consumable extends Item {
    private final ChargeTracker chargeTracker;

    public Consumable(String id, String name, int value, Rarity rarity, int charges) {
        super(id, name, value, rarity, ItemType.CONSUMABLE);
        this.chargeTracker = new ChargeTracker(charges);
    }

    @Override
    public void use() {
        if (chargeTracker.use()) {
            System.out.printf("Used %s. Charges left: %d%n", getName(), chargeTracker.getCharges());
        } else {
            System.out.println(getName() + " has no charges left!");
        }
    }

    public boolean hasCharges() {
        return chargeTracker.hasCharges();
    }

    @Override
    public String toString() {
        return String.format("[Consumable] %s (Value: %d, Rarity: %s, Charges: %d)",
                getName(), getValue(), getRarity().getDisplayName(), chargeTracker.getCharges());
    }
}