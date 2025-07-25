public class CreateCharacterEvent implements Event {
    private String name;
    private String role;

    public CreateCharacterEvent(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}