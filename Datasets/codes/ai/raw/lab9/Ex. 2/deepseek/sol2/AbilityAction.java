public final class AbilityAction extends Action {
    private final String abilityName;

    public AbilityAction(Character actor, String abilityName, ActionEventListener listener) {
        super(actor, listener);
        this.abilityName = Objects.requireNonNull(abilityName, "Ability name cannot be null");
    }

    @Override
    public void execute() {
        notifyExecution(true, "Used ability: " + abilityName);
    }
}