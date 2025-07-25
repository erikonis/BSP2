public class NameInvalidException extends Exception {
    
    private String reason, name;

    public NameInvalidException(String reason, String name) {
        this.reason = reason;
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public String getName() {
        return name;
    }
}
