public class Mage {
    private final String name;

    public Mage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Mage other)) return false;
        if (!other.canEqual(this)) return false;
        return name.equals(other.name);
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof Mage;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}