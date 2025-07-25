public class Character {
    private final String name;
    private final CharacterRole role;

    public Character(String name, CharacterRole role) throws InvalidCharacterNameException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidCharacterNameException("Character name cannot be empty.");
        }
        if (name.length() > 20) {
            throw new InvalidCharacterNameException("Character name cannot exceed 20 characters.");
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
        return name + " (" + role + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Character)) return false;
        Character other = (Character) obj;
        return this.name.equals(other.name) && this.role == other.role;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + role.hashCode();
    }
}