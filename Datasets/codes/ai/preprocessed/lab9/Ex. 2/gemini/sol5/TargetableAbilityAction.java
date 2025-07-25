public class TargetableAbilityAction implements Action {
    private Character user;
    private String abilityName;
    private Character target;
    private int power;

    public TargetableAbilityAction(Character user, String abilityName, Character target, int power) {
        this.user = user;
        this.abilityName = abilityName;
        this.target = target;
        this.power = power;
    }

    @Override
    public String getName() {
        return abilityName;
    }

    @Override
    public Character getUser() {
        return user;
    }

    @Override
    public boolean execute() {
        if (target != null) {
            Logger.getInstance().logEvent(user.getName() + " uses " + abilityName + " on " + target.getName() + " with power " + power + ".");
            target.takeDamage(power);
            return true;
        } else {
            Logger.getInstance().logEvent("Target for " + abilityName + " was not specified. Action failed.");
            return false;
        }
    }
}