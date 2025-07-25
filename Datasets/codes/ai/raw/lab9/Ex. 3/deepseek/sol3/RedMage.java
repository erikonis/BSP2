public class RedMage implements Mage {
    private final Mage base;
    private final int power;
    
    public RedMage(String name, int power) {
        this.base = new BaseMage(name);
        this.power = power;
    }
    
    public String getName() {
        return base.getName();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mage)) return false;
        Mage mage = (Mage) o;
        return getName().equals(mage.getName());
    }
    
    @Override
    public int hashCode() {
        return base.hashCode();
    }
}