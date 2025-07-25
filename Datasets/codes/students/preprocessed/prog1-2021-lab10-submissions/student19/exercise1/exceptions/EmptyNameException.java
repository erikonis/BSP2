public class EmptyNameException extends Exception{
    private String message;

    public EmptyNameException(String name) {
        message = "Invalid character name (name can't be empty): " + name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
    
}
