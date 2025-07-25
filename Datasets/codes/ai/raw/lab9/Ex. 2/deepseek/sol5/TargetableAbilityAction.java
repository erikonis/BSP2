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
    public void execute() {
        boolean success = target != null;
        String message = success ? 
            String.format("%s uses %s on %s (Power: %d)", 
                user.getName(), abilityName, target.getName(), power) :
            "No target specified";

        if (success) {
            int previousHealth = target.getCurrentHealth();
            target.modifyHealth(power);
            
            // Check for death events
            if (previousHealth > 0 && target.getCurrentHealth() <= 0) {
                if (user == target) {
                    GameLogger.getInstance().logSuicide(user);
                } else {
                    GameLogger.getInstance().logKill(user, target);
                }
            }
        }

        GameLogger.getInstance().logAction(this, success, message);
    }

    @Override
    public Character getUser() {
        return user;
    }

    @Override
    public String getDescription() {
        return String.format("%s targets %s with %s (Power: %d)", 
            user.getName(), 
            target != null ? target.getName() : "none", 
            abilityName, 
            power);
    }
}