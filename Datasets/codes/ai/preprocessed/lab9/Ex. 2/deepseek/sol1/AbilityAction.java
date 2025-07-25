public class AbilityAction extends Action {
    private final String abilityName;

    public AbilityAction(Character user, String abilityName) {
        super(user);
        this.abilityName = Objects.requireNonNull(abilityName, "Ability name cannot be null");
    }

    @Override
    public boolean execute() {
        GameLogger.getInstance().logAction(this, true, "Used ability: " + abilityName);
        return true;
    }

    public String getAbilityName() {
        return abilityName;
    }
}