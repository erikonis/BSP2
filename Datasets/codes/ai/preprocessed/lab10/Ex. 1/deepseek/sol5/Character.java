public class Character {
    private final String name;
    private final CharacterRole role;

    public Character(String name, CharacterRole role) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Character name cannot be empty");
        }
        if (name.length() > 20) {
            throw new IllegalArgumentException("Character name cannot exceed 20 characters");
        }
        if (role == null) {
            throw new IllegalArgumentException("Character role cannot be null");
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
}