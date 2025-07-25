package lu.uni.programming1.lab10.exercise1.exceptions;

import lu.uni.programming1.lab10.exercise1.Character;

public class PartyRoleLimitException extends Exception {
    private String message;

    public PartyRoleLimitException(Character c) {
        message = "Can't add " + c.toString() + " to party: the party has reached the limit for the role " + c.getRole();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
