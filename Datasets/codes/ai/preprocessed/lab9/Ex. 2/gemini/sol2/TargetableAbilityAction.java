public class TargetableAbilityAction implements Action {
    private Character user;
    private String abilityName;
    private Target targetResolver;
    private int power;

    public TargetableAbilityAction(Character user, String abilityName, Target targetResolver, int power) {
        if (user == null || abilityName == null || abilityName.trim().isEmpty()) {
            throw new IllegalArgumentException("User and ability name cannot be null or empty.");
        }
        this.user = user;
        this.abilityName = abilityName;
        this.targetResolver = targetResolver;
        this.power = power;
    }

    public String getAbilityName() {
        return abilityName;
    }

    @Override
    public Character getUser() {
        return user;
    }

    @Override
    public Target getTarget() {
        return targetResolver;
    }

    public int getPower() {
        return power;
    }

    @Override
    public boolean execute() {
        Character target = (targetResolver != null) ? targetResolver.resolveTarget() : null;
        if (target == null) {
            EventManager.getInstance().publishEvent(new ActionExecutedEvent(this, false, null));
            System.out.println(user.getName() + " tried to use targetable ability '" + abilityName + "' but no target was specified!");
            return false;
        }

        int initialTargetHealth = target.getCurrentHealth();
        target.takeDamage(-power); // Negative power means heal
        int finalTargetHealth = target.getCurrentHealth();

        EventManager.getInstance().publishEvent(new ActionExecutedEvent(this, true, target));
        System.out.println(user.getName() + " uses '" + abilityName + "' on " + target.getName() + " with power " + power + ".");

        // Kill event is now handled directly in Character.takeDamage()

        return true;
    }

    @Override
    public String getDescription() {
        String targetDescription = (targetResolver != null) ? " on " + targetResolver.resolveTarget() : " (no target)";
        return "Targetable Ability: " + abilityName + targetDescription;
    }
}