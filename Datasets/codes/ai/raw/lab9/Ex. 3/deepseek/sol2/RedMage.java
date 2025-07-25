public class RedMage {
    private final Mage baseMage;
    private final int extraPower;

    public RedMage(String name, int extraPower) {
        this.baseMage = new Mage(name);
        this.extraPower = extraPower;
    }

    public String getName() {
        return baseMage.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RedMage)) return false;
        RedMage redMage = (RedMage) o;
        return baseMage.equals(redMage.baseMage);
    }

    @Override
    public int hashCode() {
        return baseMage.hashCode();
    }
}