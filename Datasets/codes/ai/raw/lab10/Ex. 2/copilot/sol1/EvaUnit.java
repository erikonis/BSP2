import java.util.Random;

public class EvaUnit<T extends Pilot> {
    private int unitNumber;
    private T pilot;
    private int synchronizationLevel;
    private boolean status;

    private static final Random RANDOM = new Random();

    public EvaUnit(int unitNumber, int synchronizationLevel) {
        if (unitNumber <= 0) {
            throw new IllegalArgumentException("Unit number must be positive.");
        }
        this.unitNumber = unitNumber;
        this.synchronizationLevel = synchronizationLevel;
        this.status = false;
    }

    public void setPilot(T pilot) {
        this.pilot = pilot;
    }

    public void start() {
        if (pilot == null) {
            System.out.println("Eva Unit cannot start without a pilot.");
            return;
        }

        int stability = Math.abs(synchronizationLevel - pilot.getCompatibility());
        int roll = RANDOM.nextInt(101);

        if (roll <= stability) {
            status = true;
            System.out.println("Eva Unit " + unitNumber + " started successfully.");
            if (pilot instanceof HumanPilot) {
                ((HumanPilot) pilot).decreaseSanity(5);
            }
        } else {
            System.out.println("Eva Unit " + unitNumber + " failed to start.");
        }
    }

    public void maneuver(Obstacle obstacle) {
        if (!status) {
            System.out.println("Eva Unit must be started to maneuver.");
            return;
        }

        int roll = RANDOM.nextInt(101);
        if (pilot instanceof HumanPilot) {
            HumanPilot humanPilot = (HumanPilot) pilot;
            if (humanPilot.getSanity() == 0) {
                roll = 0;
            } else {
                roll += 20;
                humanPilot.decreaseSanity(obstacle.getMentalToll());
            }
        }

        if (roll >= 50) {
            System.out.println("Eva Unit " + unitNumber + " successfully maneuvered the obstacle.");
        } else {
            System.out.println("Eva Unit " + unitNumber + " failed to maneuver the obstacle.");
        }
    }

    @Override
    public String toString() {
        return "Eva Unit " + unitNumber + " (Synchronization Level: " + synchronizationLevel + ", Status: " + (status ? "On" : "Off") + ")";
    }
}
