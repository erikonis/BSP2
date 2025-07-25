import java.util.Random;

public class EvaUnit<T extends Pilot> {
    private int unitNumber;
    private T pilot;
    private int syncLevel; // Synchronization level (0 to 100)
    private boolean isOn;  // Eva unit status (on/off)

    public EvaUnit(int unitNumber, T pilot, int syncLevel) {
        this.unitNumber = unitNumber;
        this.pilot = pilot;
        this.syncLevel = syncLevel;
        this.isOn = false; // Default status is off
    }

    public boolean start() {
        if (pilot == null) {
            System.out.println("No pilot assigned.");
            return false;
        }

        // Calculate stability based on synchronization level and pilot compatibility
        int stability = Math.abs(syncLevel - pilot.getCompatibility());
        Random rand = new Random();
        int roll = rand.nextInt(101); // Roll a number between 0 and 100

        if (roll <= stability) {
            this.isOn = true;
            if (pilot instanceof HumanPilot) {
                // Special behavior for Human Pilots: decrease sanity by 5
                ((HumanPilot) pilot).decreaseSanity(5);
                if (((HumanPilot) pilot).getSanity() == 0) {
                    System.out.println(pilot.getName() + "'s sanity is too low to pilot the Eva anymore.");
                    this.isOn = false;
                    return false;
                }
            }
            System.out.println("Eva Unit-" + unitNumber + " is now started.");
            return true;
        } else {
            System.out.println("Eva Unit-" + unitNumber + " failed to start.");
            return false;
        }
    }

    public boolean maneuver(Obstacle obstacle) {
        if (!isOn) {
            System.out.println("Eva Unit-" + unitNumber + " is not started.");
            return false;
        }

        Random rand = new Random();
        int roll = rand.nextInt(101); // Roll a number between 0 and 100
        int finalRoll = roll;

        if (pilot instanceof HumanPilot) {
            HumanPilot humanPilot = (HumanPilot) pilot;
            if (humanPilot.getSanity() > 0) {
                finalRoll += 20; // Human pilot gets +20 if sanity > 0
            } else {
                finalRoll = 0; // If sanity is 0, their roll is always 0
            }
        }

        if (finalRoll >= 50) {
            System.out.println("Eva Unit-" + unitNumber + " successfully maneuvered the obstacle!");
            return true;
        } else {
            System.out.println("Eva Unit-" + unitNumber + " failed to maneuver the obstacle.");
            return false;
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public T getPilot() {
        return pilot;
    }

    public int getUnitNumber() {
        return unitNumber;
    }
}