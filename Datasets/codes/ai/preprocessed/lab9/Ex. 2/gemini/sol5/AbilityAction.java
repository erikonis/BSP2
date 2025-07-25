public class AbilityAction implements Action {
    private Character user;
    private String abilityName;

    public AbilityAction(Character user, String abilityName) {
        this.user = user;
        this.abilityName = abilityName;
    }

    @Override
    public String getName() {
        return abilityName;
    }

    @Override
    public Character getUser() {
        return user;
    }

    @Override
    public boolean execute() {
        Logger.getInstance().logEvent(user.getName() + " uses ability " + abilityName + ".");
        return true;
    }
}