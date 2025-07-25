public class CharacterKilledEvent extends GameEvent {
    private Character character;

    public CharacterKilledEvent(Character character) {
        this.character = character;
        if (character == null) {
            throw new IllegalArgumentException("Character cannot be null.");
        }
    }

    public Character getCharacter() {
        return character;
    }

    @Override
    public String getLogMessage() {
        return "[" + formattedTimestamp() + "] DEATH: " + character.getName() + " has been killed.";
    }
}