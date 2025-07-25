public class Mage implements Character {
    private String name;

    public Mage(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Character)) {
            return false;
        }
        Character character = (Character) obj;
        return name.equals(character.getName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}