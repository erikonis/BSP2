public class ActionJump extends Action {
   

    public ActionJump(Character character) {
        super(character);
    }

    @Override
    public void execute() {
        if (super.getCharacter().getCurrentHealth() > 0) {
            logSucceed(this);
        } else {
            logFail(super.getCharacter());
        }
        
    }

    @Override
    public String toString() {
        return super.toString() + super.getCharacter().getName() + " jumped";
    }
    
}
