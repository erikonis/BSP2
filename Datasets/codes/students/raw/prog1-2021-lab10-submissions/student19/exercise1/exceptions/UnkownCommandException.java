package lu.uni.programming1.lab10.exercise1.exceptions;

public class UnkownCommandException extends IndexOutOfBoundsException{
    private String message;

    public UnkownCommandException(int index) {
       message = "Unexpected index: Index " + index + " out of bounds for length 2";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
