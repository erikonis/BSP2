public class TargetableAbilityAction extends AbilityAction {
    private final Character target;
    private final int power;

    public TargetableAbilityAction(Character user, String name, Character target, int power) {
        super(user, name);
        this.target = target;
        this.power = power;
    }

    @Override
    public boolean execute() {
        if (target == null) {
            Logger.getInstance().log(user.getName() + " tried to use " + name + " but failed due to missing target.", false);
            return false;
        }

        target.adjustHealth(power);
        Logger.getInstance().log(user.getName() + " used " + name + " on " + target.getName() + " with power " + power, true);

        if (target.isDead()) {
            if (target == user) {
                Logger.getInstance().log(user.getName() + " killed themselves.", true);
            } else {
                Logger.getInstance().log(user.getName() + " killed " + target.getName(), true);
            }
        }

        return true;
    }
}