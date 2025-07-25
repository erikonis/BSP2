public class Mage {
    private final String name;

    public Mage(String name) {
        this.name = name;
    }

    protected boolean equalsNameOnly(Mage other) {
        return this.name.equals(other.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Mage other) {
            return equalsNameOnly(other);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public String getName() {
        return name;
    }
}