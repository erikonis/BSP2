import java.util.Random;

public class EvaUnit {
    private static final Random random = new Random();
    
    private final int unitNumber;
    private final Pilot pilot;
    private final int syncLevel;
    private boolean isActive;
    
    public EvaUnit(int unitNumber, Pilot pilot, int syncLevel) {
        if (unitNumber <= 0) throw new IllegalArgumentException("Unit number must be positive");
        if (syncLevel < 0 || syncLevel > 100) throw new IllegalArgumentException("Sync level must be 0-100");
        
        this.unitNumber = unitNumber;
        this.pilot = pilot;
        this.syncLevel = syncLevel;
        this.isActive = false;
    }
    
    public void start() {
        if (!pilot.canOperate()) {
            System.out.printf("%s cannot pilot Unit-%d (mental breakdown)%n", 
                            pilot.getName(), unitNumber);
            return;
        }
        
        pilot.onStartAttempt();
        int stability = 100 - Math.abs(syncLevel - pilot.getCompatibility());
        int roll = random.nextInt(101);
        
        if (roll <= stability) {
            isActive = true;
            System.out.printf("Unit-%d activated! %s synchronized successfully.%n",
                            unitNumber, pilot.getName());
        } else {
            System.out.printf("Unit-%d failed to start! Synchronization unstable.%n", unitNumber);
        }
    }
    
    public void maneuver(Obstacle obstacle) {
        if (!isActive) {
            System.out.printf("Unit-%d must be activated first!%n", unitNumber);
            return;
        }
        
        if (!pilot.canOperate()) {
            System.out.printf("%s cannot maneuver Unit-%d (mental breakdown)%n",
                            pilot.getName(), unitNumber);
            return;
        }
        
        int roll = pilot.rollManeuver(obstacle);
        boolean success = roll >= 50;
        
        System.out.printf("Unit-%d attempting maneuver against %s...%n",
                        unitNumber, obstacle.getDescription());
        System.out.printf("%s rolled %d %s%n",
                        pilot.getName(), roll,
                        success ? "(Success!)" : "(Failed)");
        
        if (pilot instanceof ConcretePilot cp && 
            cp.getBehavior() instanceof HumanPilotBehavior human) {
            System.out.printf("%s's sanity: %d%n", 
                            pilot.getName(), human.getSanity());
        }
    }
    
    public void shutdown() {
        isActive = false;
        System.out.printf("Unit-%d shutting down...%n", unitNumber);
    }
    
    public boolean isActive() {
        return isActive;
    }
}