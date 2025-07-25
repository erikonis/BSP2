public class AlreadyInPartyException extends Exception {
    
    private String message;

    public AlreadyInPartyException(String message){
        this.message = message;
    }

    public String getMessage() { 
        return message;
    }

}
