import java.util.Objects;

public record Character(String name, CharacterRole role) {
    public Character {
        Objects.requireNonNull(name, "Name cannot be null");
        Objects.requireNonNull(role, "Role cannot be null");

        if (name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
        if (name.length() > 20) {
            throw new IllegalArgumentException("Name cannot exceed 20 characters");
        }
    }
}