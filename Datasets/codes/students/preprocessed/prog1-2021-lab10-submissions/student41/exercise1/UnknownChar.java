public class UnknownChar extends Exception {
    
    private String role;

    public UnknownChar(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

}
