public class FullPartyException extends Exception {
    private String message;

    public FullPartyException() {
        message = "The party is full: no other characters can be added to it.";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
