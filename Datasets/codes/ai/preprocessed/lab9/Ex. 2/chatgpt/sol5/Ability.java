public class Ability implements Action {
    protected final Character user;
    protected final String abilityName;

    public Ability(Character user, String abilityName) {
        this.user = user;
        this.abilityName = abilityName;
    }

    @Override
    public void execute() {
        Logger.getInstance().logAction(abilityName, user, null, true);
    }
}