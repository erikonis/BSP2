public class Character {
    private String name;
    private CharacterRole role;

    public Character(String name, CharacterRole role) throws Exception {
        if (name == null || name.isEmpty() || name.length() > 20) {
            throw new Exception("Invalid character name.");
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