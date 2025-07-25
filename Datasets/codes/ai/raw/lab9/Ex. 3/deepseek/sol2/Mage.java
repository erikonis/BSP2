public class Mage {
    private final MageIdentity identity;

    public Mage(String name) {
        this.identity = new MageIdentity(name);
    }

    public final String getName() {
        return identity.name();
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mage)) return false;
        Mage mage = (Mage) o;
        return identity.equals(mage.identity);
    }

    @Override
    public final int hashCode() {
        return identity.hashCode();
    }
}