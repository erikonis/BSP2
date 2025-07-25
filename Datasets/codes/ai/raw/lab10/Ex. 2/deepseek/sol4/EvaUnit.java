package evangelion.units;

import evangelion.pilots.Pilot;
import evangelion.obstacles.Obstacle;
import java.util.Random;

public class EvaUnit<T extends Pilot> {
    private int unitNumber;
    private T pilot;
    private int syncLevel;
    private boolean isActive;
    private Random random = new Random();

    public EvaUnit(int unitNumber, int syncLevel) {
        this.unitNumber = unitNumber;
        this.syncLevel = Math.max(0, Math.min(100, syncLevel));
        this.isActive = false;
    }

    public void assignPilot(T pilot) {
        this.pilot = pilot;
        System.out.printf("Eva Unit-%d (%d sync) is now piloted by %s%n",
                         unitNumber, syncLevel, pilot);
    }

    public boolean start() {
        if (pilot == null) {
            System.out.printf("Eva Unit-%d (%d sync) can't start: no pilot present.%n",
                            unitNumber, syncLevel);
            return false;
        }

        System.out.printf("Start sequence for Eva Unit-%d (%d sync): ", unitNumber, syncLevel);
        
        int stability = 100 - Math.abs(syncLevel - pilot.getCompatibility());
        int roll = random.nextInt(101);
        
        if (roll <= stability) {
            isActive = true;
            System.out.println("Started!");
            return true;
        } else {
            System.out.println("Failed!");
            return false;
        }
    }

    public boolean maneuver(Obstacle obstacle) {
        if (!isActive) return false;
        
        int roll = pilot.rollForManeuver(obstacle);
        return roll >= 50;
    }
    
    @Override
    public String toString() {
        return String.format("Eva Unit-%d (%d sync)", unitNumber, syncLevel);
    }
}