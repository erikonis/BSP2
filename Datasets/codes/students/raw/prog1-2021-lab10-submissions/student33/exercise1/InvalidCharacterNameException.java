package lu.uni.programming1.lab10.exercise1;

public class InvalidCharacterNameException extends Exception {

    String message;

    public InvalidCharacterNameException(String message) {
        this.message=message;
    }

    public String getMessage() {
        return message;
    }
    
}
