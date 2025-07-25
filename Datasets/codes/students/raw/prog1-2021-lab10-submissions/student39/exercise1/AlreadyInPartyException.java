package lu.uni.programming1.lab10.exercise1;

public class AlreadyInPartyException extends Exception {
    
    private String message;

    public AlreadyInPartyException(String message){
        this.message = message;
    }

    public String getMessage() { 
        return message;
    }

}
