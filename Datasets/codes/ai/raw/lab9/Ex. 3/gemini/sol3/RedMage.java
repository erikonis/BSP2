public class RedMage extends Mage implements NamedEntity {
    private String swordType;
    private int meleePower;

    public RedMage(String name, int mana, String swordType, int meleePower) {
        super(name, mana);
        this.swordType = swordType;
        this.meleePower = meleePower;
    }

    public String getSwordType() {
        return swordType;
    }

    public int getMeleePower() {
        return meleePower;
    }

    @Override
    public String toString() {
        return "RedMage{name='" + getName() + "', mana=" + getMana() + ", swordType='" + swordType + "', meleePower=" + meleePower + '}';
    }

    // We do NOT override equals or hashCode here for name-based comparison.
    // RedMage's equals will be the default object equality.
}