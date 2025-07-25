public class UnkownCharacterRoleException extends Exception {
    private String message;

    public UnkownCharacterRoleException() {
        message = "Unkown character role.";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
