import java.util.Objects;

public class Mage implements NamedEntity {
    private String name;
    private int mana;

    public Mage(String name, int mana) {
        this.name = name;
        this.mana = mana;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getMana() {
        return mana;
    }

    // Basic equals for exact Mage type comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Mage other = (Mage) obj;
        return this.mana == other.mana && Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mana);
    }

    @Override
    public String toString() {
        return "Mage{name='" + name + "', mana=" + mana + '}';
    }
}