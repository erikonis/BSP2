public class TargetableAbility extends Ability {
    private Character target;
    private int power;

    public TargetableAbility(Character user, String name, Character target, int power) {
        super(user, name);
        this.target = target;
        this.power = power;
    }

    @Override
    public void execute() {
        if (target != null) {
            target.modifyHealth(power);
            Logger.getInstance().log(new Date(), user.getName() + " used " + super.name + " on " + target.getName() + " with power " + power);
            if (!target.isAlive()) {
                Logger.getInstance().log(new Date(), target.getName() + " was killed by " + user.getName());
            }
        } else {
            Logger.getInstance().log(new Date(), user.getName() + " tried to use " + super.name + " but failed due to no target.");
        }
    }
}
