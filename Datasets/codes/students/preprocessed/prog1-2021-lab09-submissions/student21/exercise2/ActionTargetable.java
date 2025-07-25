public class ActionTargetable extends Action {

    private Character targetCharacter;
    private int value;

    public ActionTargetable(Character character, Character targetCharacter, int value) {
        super(character);
        this.targetCharacter = targetCharacter;
        this.value = value;
    }

    @Override
    public void execute() {

        if (targetCharacter.getCurrentHealth() > 0) {
            if (targetCharacter.getCurrentHealth() > value) {
                logSucceed(this);
                targetCharacter.setCurrentHealth(targetCharacter.getCurrentHealth() - value);
            } else {
                logSucceed(this);
                kill(targetCharacter);
                targetCharacter.setCurrentHealth(targetCharacter.getCurrentHealth() - value);
            }
        } else {
            logFail(super.getCharacter());
        }
        

    }

    @Override
    public String toString() {
        return super.toString() + super.getCharacter().getName() + " hit " + targetCharacter.getName() + " taking "
                + value + " health points";
    }

}
