public class ActionAbility extends Action {

    private String name;

    public ActionAbility(Character character, String name) {
        super(character);
        this.name = name;
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
        return super.toString() + super.getCharacter().getName() + " sucessfully executed ability action: " + name;
    }

}
