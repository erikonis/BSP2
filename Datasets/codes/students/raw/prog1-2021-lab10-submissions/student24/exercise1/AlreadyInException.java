package lu.uni.programming1.lab10.exercise1;

public class AlreadyInException extends Exception {
    
    private Character character;

    AlreadyInException(Character character) {
        this.character = character;
    }
    
    public Character getCharacter() {
        return character;
    }

}
