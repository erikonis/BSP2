public enum CharacterRole {
    DAMAGE ("DAMAGE"), 
    HEALER ("HEALER"), 
    TANK ("TANK");

    private String role;

    private CharacterRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

}
