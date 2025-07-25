public final class TargetedActionCommand implements GameCommand {
    private final Character actor;
    private final Character target;
    private final String actionName;
    private final int power;
    private final Instant timestamp;
    
    public TargetedActionCommand(Character actor, Character target, String actionName, int power) {
        this.actor = Objects.requireNonNull(actor);
        this.target = target; // Can be null for self-target
        this.actionName = Objects.requireNonNull(actionName);
        this.power = power;
        this.timestamp = Instant.now();
    }
    
    @Override
    public CommandResult execute() {
        if (target == null) {
            return new CommandResult(false, "No target specified", actor, null);
        }
        
        Character modifiedTarget = power > 0 
            ? target.applyHealing(power) 
            : target.applyDamage(-power);
        
        String message = String.format("%s used %s on %s (%+d)", 
            actor.getName(), actionName, target.getName(), power);
        
        return new CommandResult(true, message, actor, modifiedTarget);
    }
    
    @Override
    public Character getActor() { return actor; }
}