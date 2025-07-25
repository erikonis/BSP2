package model.items.consumables;

public class ChargeTracker {
    private int charges;

    public ChargeTracker(int initialCharges) {
        if (initialCharges < 0) {
            throw new IllegalArgumentException("Charges cannot be negative");
        }
        this.charges = initialCharges;
    }

    public boolean use() {
        if (charges > 0) {
            charges--;
            return true;
        }
        return false;
    }

    public boolean hasCharges() {
        return charges > 0;
    }

    public int getCharges() {
        return charges;
    }
}