import java.util.Objects;

public final class Character {
    private final String name;
    private final Role role;

    private Character(String name, Role role) {
        this.name = validateName(name);
        this.role = Objects.requireNonNull(role, "Role cannot be null");
    }

    private static String validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (name.length() > 20) {
            throw new IllegalArgumentException("Name cannot exceed 20 characters");
        }
        return name;
    }

    public static CharacterBuilder builder() {
        return new CharacterBuilder();
    }

    // Getters
    public String name() { return name; }
    public Role role() { return role; }

    @Override
    public String toString() {
        return name + " (" + role + ")";
    }

    public static class CharacterBuilder {
        private String name;
        private Role role;

        public CharacterBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CharacterBuilder role(Role role) {
            this.role = role;
            return this;
        }

        public Character build() {
            return new Character(name, role);
        }
    }
}