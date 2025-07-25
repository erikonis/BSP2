import java.util.Objects;

public final class Character {
    private final String name;
    private final CharacterRole role;
    
    public Character(String name, CharacterRole role) {
        this.name = validateName(name);
        this.role = Objects.requireNonNull(role, "Role cannot be null");
    }
    
    private String validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (name.length() > 20) {
            throw new IllegalArgumentException("Name cannot exceed 20 characters");
        }
        return name;
    }
    
    // Getters
    public String getName() { return name; }
    public CharacterRole getRole() { return role; }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Character)) return false;
        Character other = (Character) o;
        return name.equals(other.name) && role == other.role;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, role);
    }
    
    @Override
    public String toString() {
        return name + " (" + role + ")";
    }
}