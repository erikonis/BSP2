public class FullRoleException extends Exception {
    
    private Character character;

    FullRoleException(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }
}
