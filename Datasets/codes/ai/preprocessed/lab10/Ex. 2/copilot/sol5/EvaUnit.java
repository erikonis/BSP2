import java.util.Random;

public class EvaUnit {
    private int unitNumber;
    private Pilot pilot;
    private int syncLevel;
    private boolean status;

    public EvaUnit(int unitNumber, Pilot pilot, int syncLevel) {
        this.unitNumber = unitNumber;
        this.pilot = pilot;
        this.syncLevel = syncLevel;
        this.status = false;
    }

    public void start() {
        if (pilot != null) {
            int stability = Math.abs(syncLevel - pilot.getCompatibility());
            Random random = new Random();
            int roll = random.nextInt(101);

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
    }

    public void maneuver(Obstacle obstacle) {
        if (status) {
            Random random = new Random();
            int roll = random.nextInt(101);

            if (pilot instanceof HumanPilot) {
                HumanPilot humanPilot = (HumanPilot) pilot;
                if (humanPilot.getSanity() > 0) {
                    roll += 20;
                    humanPilot.decreaseSanity(obstacle.getMentalToll());
                } else {
                    roll = 0;
                }
            }

            if (roll >= 50) {
                System.out.println("Eva Unit " + unitNumber + " successfully maneuvered the obstacle.");
            } else {
                System.out.println("Eva Unit " + unitNumber + " failed to maneuver the obstacle.");
            }
        } else {
            System.out.println("Eva Unit " + unitNumber + " is not started.");
        }
    }
}