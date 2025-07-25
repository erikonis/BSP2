public class Mage {
    private final String name;
    
    public Mage(String name) {
        this.name = name;
    }
    
    @Override
    public boolean equals(Object o) {
        // 1. Check if same object reference
        if (this == o) return true;
        
        // 2. Check if null or not a Mage (or subclass)
        if (!(o instanceof Mage)) return false;
        
        // 3. Compare only the name field
        Mage other = (Mage) o;
        return Objects.equals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}