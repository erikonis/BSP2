public class Mage {
    private String name;

    public Mage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Mage mage = (Mage) obj;
        return name.equals(mage.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}