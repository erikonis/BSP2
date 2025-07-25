public final class MageIdentity {
    private final String name;

    public MageIdentity(String name) {
        this.name = Objects.requireNonNull(name, "Name cannot be null");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MageIdentity)) return false;
        MageIdentity that = (MageIdentity) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}