public class TargetableAbility extends Ability {
    private final Character target;
    private final int power;

    public TargetableAbility(Character user, String abilityName, Character target, int power) {
        super(user, abilityName);
        this.target = target;
        this.power = power;
    }

    @Override
    public void execute() {
        boolean success = target != null;
        Logger.getInstance().logAction(abilityName, user, target, success);
        if (success) {
            int oldHealth = target.getCurrentHealth();
            target.modifyHealth(power);
            int newHealth = target.getCurrentHealth();

            if (oldHealth > 0 && newHealth == 0) {
                if (user.equals(target)) {
                    Logger.getInstance().logSuicide(user);
                } else {
                    Logger.getInstance().logDeath(target, user);
                }
            }
        }
    }
}