public class Mage {
    private String name;
    private int mana;

    public Mage(String name, int mana) {
        this.name = name;
        this.mana = mana;
    }

    public String getName() {
        return name;
    }

    public int getMana() {
        return mana;
    }

    // We might keep a basic equals for exact Mage type comparison if needed
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Mage other = (Mage) obj;
        return this.mana == other.mana && java.util.Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, mana);
    }

    @Override
    public String toString() {
        return "Mage{name='" + name + "', mana=" + mana + '}';
    }
}