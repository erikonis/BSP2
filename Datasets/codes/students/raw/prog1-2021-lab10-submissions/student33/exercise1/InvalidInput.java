package lu.uni.programming1.lab10.exercise1;

public class InvalidInput extends Exception {

    String message;

    public InvalidInput(String message) {
        this.message=message;
        
    }

    public String getMessage() {
        return message;
    }
    
}
