public class ConcretePilot implements Pilot {
    private final String name;
    private final int baseCompatibility;
    private final PilotBehavior behavior;
    
    public ConcretePilot(String name, int compatibility, PilotBehavior behavior) {
        if (compatibility < 0 || compatibility > 100) {
            throw new IllegalArgumentException("Compatibility must be 0-100");
        }
        this.name = name;
        this.baseCompatibility = compatibility;
        this.behavior = behavior;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public int getCompatibility() {
        return behavior.calculateEffectiveCompatibility(baseCompatibility);
    }
    
    @Override
    public int rollManeuver(Obstacle obstacle) {
        return behavior.performManeuverRoll(obstacle);
    }
    
    @Override
    public void onStartAttempt() {
        behavior.onStartAttempt();
    }
    
    @Override
    public boolean canOperate() {
        return behavior.isOperational();
    }
}