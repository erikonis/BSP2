import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Mage)) {
            return false;
        }
        Mage other = (Mage) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Mage{name='" + name + "', mana=" + mana + '}';
    }
}