public class TargetableAbilityAction extends Action {
    private final Character target;
    private final String abilityName;
    private final int power;

    public TargetableAbilityAction(Character user, Character target, String abilityName, int power) {
        super(user);
        this.target = target;
        this.abilityName = abilityName;
        this.power = power;
    }

    @Override
    public void execute() {
        if (target == null) {
            Logger.getInstance().log("Failed: " + user.getName() + " tried to use " + abilityName + " but no target was specified.");
            return;
        }

        target.modifyHealth(power);
        Logger.getInstance().log(user.getName() + " uses " + abilityName + " on " + target.getName() +
            " with power " + power + ". Target now at " + target.getCurrentHealth() + " HP.");

        if (target.isDead()) {
            if (user == target) {
                Logger.getInstance().log(user.getName() + " has killed themselves!");
            } else {
                Logger.getInstance().log(user.getName() + " has killed " + target.getName() + "!");
            }
        }
    }
}