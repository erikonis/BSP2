import java.util.Objects;

public class Character {
    private String name;
    private CharacterRole role;

    public Character(String name, CharacterRole role) throws InvalidCharacterException {
        setName(name);
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public CharacterRole getRole() {
        return role;
    }

    public void setName(String name) throws InvalidCharacterException {
        if (name == null || name.trim().isEmpty() || name.length() > 20) {
            throw new InvalidCharacterException("Invalid name. Must be non-empty and max 20 characters.");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return role + " - " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Character)) return false;
        Character character = (Character) o;
        return Objects.equals(name, character.name) && role == character.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, role);
    }
}