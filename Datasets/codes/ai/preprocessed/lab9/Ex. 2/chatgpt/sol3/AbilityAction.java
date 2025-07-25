public class AbilityAction implements Action {
    private final Character user;
    private final String abilityName;

    public AbilityAction(Character user, String abilityName) {
        this.user = user;
        this.abilityName = abilityName;
    }

    @Override
    public boolean execute() {
        Logger.getInstance().logAction("Ability: " + abilityName, user, null, true);
        return true;
    }
}