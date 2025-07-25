public class Controller {
    private Character character;

    public Controller(Character character) {
        this.character = character;
    }
    
    public void jump() {
        Action jump = new ActionJump(character);
        jump.execute();
    }

    public void ability(String name) {
        Action ability = new ActionAbility(character, name);
        ability.execute();
    }

    public void target(Character targetCharacter, int value) {
        if (targetCharacter == character) {
            System.out.println("Cannot perform actions on himself");
        } else {
            Action target = new ActionTargetable(character, targetCharacter, value);
            target.execute();
        }
        
    }

    
}
