public class Character {
    private String name;
    private CharacterRole role;

    public Character(String name, CharacterRole role) {
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
        return name + " (" + role + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Character character = (Character) obj;
        return name.equals(character.name) && role == character.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, role);
    }
}