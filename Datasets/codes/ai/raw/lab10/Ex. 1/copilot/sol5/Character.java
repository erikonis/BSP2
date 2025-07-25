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
}
