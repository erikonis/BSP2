import java.util.Random;

public class EvaUnit<T extends Pilot> {
    private int unitNumber;
    private T pilot;
    private int synchronizationLevel;
    private boolean isOn;
    private final Random random = new Random();

    public EvaUnit(int unitNumber, T pilot) {
        if (unitNumber <= 0) {
            throw new IllegalArgumentException("Unit number must be positive.");
        }
        this.unitNumber = unitNumber;
        this.pilot = pilot;
        this.synchronizationLevel = 0;
        this.isOn = false;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public T getPilot() {
        return pilot;
    }

    public int getSynchronizationLevel() {
        return synchronizationLevel;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean start() {
        if (pilot == null) {
            System.out.println("Eva Unit-" + unitNumber + " cannot start: no pilot.");
            return false;
        }

        int stability = Math.abs(synchronizationLevel - pilot.getCompatibility());
        int roll = random.nextInt(101);

        System.out.println("Eva Unit-" + unitNumber + " attempting to start. Stability: " + stability + ", Roll: " + roll);

        if (pilot instanceof SanityManagement) {
            SanityManagement humanPilot = (SanityManagement) pilot;
            if (!humanPilot.canAct()) {
                System.out.println("Human Pilot " + pilot.getName() + " has 0 sanity and cannot start.");
                return false;
            }
            humanPilot.reduceSanity(5);
            System.out.println("Human Pilot " + pilot.getName() + "'s sanity reduced to " + humanPilot.getSanity());
        }

        if (roll <= stability) {
            isOn = true;
            System.out.println("Eva Unit-" + unitNumber + " started successfully.");
            return true;
        } else {
            System.out.println("Eva Unit-" + unitNumber + " failed to start.");
            return false;
        }
    }

    public boolean maneuver(Obstacle obstacle) {
        if (!isOn()) {
            System.out.println("Eva Unit-" + unitNumber + " cannot maneuver: unit is off.");
            return false;
        }
        if (pilot == null) {
            System.out.println("Eva Unit-" + unitNumber + " cannot maneuver: no pilot.");
            return false;
        }

        int pilotRoll = random.nextInt(101);
        System.out.println("Eva Unit-" + unitNumber + " attempting to maneuver against " + obstacle.getName() + ". Pilot Roll: " + pilotRoll);

        if (pilot instanceof SanityManagement) {
            SanityManagement humanPilot = (SanityManagement) pilot;
            if (!humanPilot.canAct()) {
                System.out.println("Human Pilot " + pilot.getName() + " has 0 sanity and cannot maneuver.");
                return false;
            }
            int mentalToll = obstacle.getMentalToll();
            int effectiveRoll = pilotRoll;
            if (humanPilot.canAct()) {
                effectiveRoll += 20;
            } else {
                effectiveRoll = 0; // Cannot dodge with 0 sanity
            }
            humanPilot.reduceSanity(mentalToll);
            System.out.println("Human Pilot " + pilot.getName() + "'s sanity reduced by " + mentalToll + " to " + humanPilot.getSanity() + ". Effective Roll: " + effectiveRoll);
            if (effectiveRoll >= 50) {
                System.out.println("Eva Unit-" + unitNumber + " successfully maneuvered against " + obstacle.getName() + ".");
                return true;
            } else {
                System.out.println("Eva Unit-" + unitNumber + " failed to maneuver against " + obstacle.getName() + ".");
                return false;
            }
        } else {
            if (pilotRoll >= 50) {
                System.out.println("Eva Unit-" + unitNumber + " successfully maneuvered against " + obstacle.getName() + ".");
                return true;
            } else {
                System.out.println("Eva Unit-" + unitNumber + " failed to maneuver against " + obstacle.getName() + ".");
                return false;
            }
        }
    }
}