public class TooLongNameException extends Exception {
    private String message;

    public TooLongNameException(String name) {
        message = "Invalid character name (name is too long - max 20 characters): " + name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
