public class BaseMage implements Mage {
    private final String name;

    public BaseMage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mage)) return false;
        Mage mage = (Mage) o;
        return name.equals(mage.getName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}