package lu.uni.programming1.lab10.exercise1.exceptions;

import lu.uni.programming1.lab10.exercise1.Character;

public class ExistingCharacterException extends Exception{
    private String message;

    public ExistingCharacterException(Character c) {
        message = "Can't add " + c.toString() + " to party, they're already in it.";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
