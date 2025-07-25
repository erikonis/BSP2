package lu.uni.programming1.lab9.exercise2;

public class Jump {

    public void use() {
        System.out.println("\nYou Jumped");
    }

    private Character characterJump;

    public Character getCharacterJump() {
        return characterJump;
    }

    public void setCharacterJump(Character characterJump) {
        this.characterJump = characterJump;
    }

    @Override
    public String toString() {
        return characterJump+" jumps.";
    }

    
    
}
