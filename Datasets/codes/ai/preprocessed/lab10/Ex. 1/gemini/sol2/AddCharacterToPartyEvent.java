public class AddCharacterToPartyEvent implements Event {
    private Character character;
    private int partyIndex;

    public AddCharacterToPartyEvent(Character character, int partyIndex) {
        this.character = character;
        this.partyIndex = partyIndex;
    }

    public Character getCharacter() {
        return character;
    }

    public int getPartyIndex() {
        return partyIndex;
    }
}