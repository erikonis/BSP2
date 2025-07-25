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

        boolean success = pilot.canStart(this, stability, roll);
        if (success) {
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

        System.out.println("Eva Unit-" + unitNumber + " attempting to maneuver against " + obstacle.getName() + ".");
        return pilot.canManeuver(this, obstacle);
    }
}