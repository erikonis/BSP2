public class Character {
    private String name;
    private CharacterRole role;

    public Character(String name, CharacterRole role) {
        if (name == null || name.isEmpty() || name.length() > 20) {
            throw new IllegalArgumentException("Character name must not be empty and must not exceed 20 characters.");
        }
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public CharacterRole getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Character{name='" + name + "', role=" + role + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Character other = (Character) obj;
        return name.equals(other.name) && role == other.role;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, role);
    }
}