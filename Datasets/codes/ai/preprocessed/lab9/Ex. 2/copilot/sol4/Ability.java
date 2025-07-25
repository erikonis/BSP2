public class Ability extends Action {
    private String abilityName;

    public Ability(Character user, String abilityName) {
        super(user);
        this.abilityName = abilityName;
    }

    @Override
    public void execute() {
        Logger.getInstance().logEvent(user.getName() + " used ability: " + abilityName);
    }
}