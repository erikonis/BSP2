public class TargetableAbilityAction extends Action {
    private final String abilityName;
    private final Character target;
    private final int power;

    public TargetableAbilityAction(Character user, String abilityName, Character target, int power) {
        super(user);
        this.abilityName = abilityName;
        this.target = target;
        this.power = power;
    }

    @Override
    public void execute() {
        if (target == null) {
            Logger.getInstance().logAction(user, this, false, null);
            return;
        }

        target.changeHealth(power);
        Logger.getInstance().logAction(user, this, true, target);

        if (target.isDead()) {
            if (user == target) {
                Logger.getInstance().logDeath(user, "suicide");
            } else {
                Logger.getInstance().logDeath(user, target.getName());
            }
        }
    }

    @Override
    public String description() {
        return user.getName() + " uses " + abilityName + " on " + target.getName() + " with power " + power;
    }
}
