public class TargetableAbility extends Action {
    private Character target;
    private int power;

    public TargetableAbility(Character user, Character target, int power) {
        super(user);
        this.target = target;
        this.power = power;
    }

    @Override
    public void execute() {
        if (target != null) {
            target.modifyHealth(power);
            Logger.getInstance().logEvent(user.getName() + " used targetable ability on " + target.getName() + " with power " + power);
        } else {
            Logger.getInstance().logEvent(user.getName() + " tried to use a targetable ability but no target was specified.");
        }
    }
}
