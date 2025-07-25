public class Character {
    private String name;
    private CharacterRole role;

    public Character(String name, CharacterRole role) throws InvalidCharacterNameException {
        if (name == null || name.isEmpty() || name.length() > 20) {
            throw new InvalidCharacterNameException("Character name must not be empty and must not exceed 20 characters.");
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
        return "Character{" +
                "name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
