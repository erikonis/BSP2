package lu.uni.programming1.lab10.exercise1;

public class PartyCharacterAddException extends Exception {
    private Character character;
    private String reason;

    public PartyCharacterAddException(Character character, String reason) {
        this.character = character;
        this.reason = reason;
    }

    public Character getCharacter() {
        return character;
    }

    public String getReason() {
        return reason;
    }
}
