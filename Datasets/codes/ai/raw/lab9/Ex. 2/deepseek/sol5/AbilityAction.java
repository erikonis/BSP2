public class AbilityAction implements Action {
    private final Character user;
    private final String abilityName;

    public AbilityAction(Character user, String abilityName) {
        this.user = user;
        this.abilityName = abilityName;
    }

    @Override
    public void execute() {
        GameLogger.getInstance().logAction(this, true, "Used ability: " + abilityName);
    }

    @Override
    public Character getUser() {
        return user;
    }

    @Override
    public String getDescription() {
        return user.getName() + " uses " + abilityName;
    }
}