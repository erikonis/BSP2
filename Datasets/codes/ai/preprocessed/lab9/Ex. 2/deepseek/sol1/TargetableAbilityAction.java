public class TargetableAbilityAction extends AbilityAction {
    private final Character target;
    private final int power;

    public TargetableAbilityAction(Character user, String abilityName, Character target, int power) {
        super(user, abilityName);
        this.target = target;
        this.power = power;
    }

    @Override
    public boolean execute() {
        if (target == null) {
            GameLogger.getInstance().logAction(this, false, "Failed - no target specified");
            return false;
        }

        boolean success = true;
        String message = abilityName + " on " + target.getName() + " (Power: " + power + ")";

        try {
            if (power > 0) {
                target.heal(power);
                message += " - Healed";
            } else if (power < 0) {
                target.takeDamage(-power);
                message += " - Damaged";

                // Check for kill
                if (!target.isAlive()) {
                    if (target == getUser()) {
                        GameLogger.getInstance().logDeath(getUser(), getUser());
                    } else {
                        GameLogger.getInstance().logDeath(getUser(), target);
                    }
                }
            } else {
                message += " - No effect";
            }
        } catch (Exception e) {
            success = false;
            message = "Failed - " + e.getMessage();
        }

        GameLogger.getInstance().logAction(this, success, message);
        return success;
    }

    public Character getTarget() {
        return target;
    }

    public int getPower() {
        return power;
    }
}