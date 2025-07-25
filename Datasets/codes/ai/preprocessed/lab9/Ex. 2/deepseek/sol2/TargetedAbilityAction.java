public final class TargetedAbilityAction extends Action {
    private final String abilityName;
    private final Character target;
    private final int power;

    public TargetedAbilityAction(Character actor, String abilityName,
                               Character target, int power, ActionEventListener listener) {
        super(actor, listener);
        this.abilityName = Objects.requireNonNull(abilityName);
        this.target = target;
        this.power = power;
    }

    @Override
    public void execute() {
        if (target == null) {
            notifyExecution(false, "No target specified for " + abilityName);
            return;
        }

        try {
            String effect;
            if (power > 0) {
                effect = "healed";
                target.modifyHealth(power);
            } else if (power < 0) {
                effect = "damaged";
                target.modifyHealth(power);
            } else {
                effect = "had no effect";
            }

            notifyExecution(true, String.format("%s %s %s (power: %d)",
                abilityName, effect, target.getName(), power));
        } catch (Exception e) {
            notifyExecution(false, "Failed to execute " + abilityName + ": " + e.getMessage());
        }
    }
}