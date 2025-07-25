public class Character {
    private final String name;
    private final CharacterRole role;

    public Character(String name, CharacterRole role) throws InvalidCharacterException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidCharacterException("Character name cannot be empty.");
        }
        if (name.length() > 20) {
            throw new InvalidCharacterException("Character name cannot exceed 20 characters.");
        }
        this.name = name.trim();
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
        return name + " [" + role + "]";
    }
}