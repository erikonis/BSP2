public class AbilityAction extends Action {
    private final String abilityName;

    public AbilityAction(Character user, String abilityName) {
        super(user);
        this.abilityName = abilityName;
    }

    @Override
    public void execute() {
        Logger.getInstance().logAction(user, this, true, null);
    }

    @Override
    public String description() {
        return user.getName() + " uses ability " + abilityName;
    }
}