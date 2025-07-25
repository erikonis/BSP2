public class TargetableAbilityAction implements Action {
    private final Character user;
    private final Character target;
    private final String abilityName;
    private final int power;

    public TargetableAbilityAction(Character user, Character target, String abilityName, int power) {
        this.user = user;
        this.target = target;
        this.abilityName = abilityName;
        this.power = power;
    }

    @Override
    public boolean execute() {
        if (target == null) {
            Logger.getInstance().logAction("Targeted Ability: " + abilityName, user, null, false);
            return false;
        }
        target.changeHealth(power);
        Logger.getInstance().logAction("Targeted Ability: " + abilityName, user, target, true);
        return true;
    }
}