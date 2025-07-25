import java.util.Random;

public class EvaUnit {
    private final int unitNumber;
    private final int syncLevel;
    private Pilot pilot;
    private boolean isOn = false;

    public EvaUnit(int unitNumber, int syncLevel) {
        this.unitNumber = unitNumber;
        this.syncLevel = syncLevel;
    }

    public void assignPilot(Pilot pilot) {
        this.pilot = pilot;
        System.out.println("Eva Unit-" + unitNumber + " (" + syncLevel + " sync) is now piloted by " + pilot);
    }

    public void start() {
        if (pilot == null) {
            System.out.println("Eva Unit-" + unitNumber + " (" + syncLevel + " sync) can’t start: no pilot present.");
            return;
        }

        if (!pilot.canStart()) {
            System.out.println("Eva Unit-" + unitNumber + " (" + syncLevel + " sync): Pilot cannot start the Eva.");
            return;
        }

        int stability = Math.abs(syncLevel - pilot.getCompatibility());
        int roll = new Random().nextInt(101);

        if (roll <= stability) {
            System.out.println("Eva Unit-" + unitNumber + " (" + syncLevel + " sync): Started!");
            isOn = true;
        } else {
            System.out.println("Eva Unit-" + unitNumber + " (" + syncLevel + " sync): Failed!");
        }

        pilot.afterStart();
    }

    public void maneuver(Obstacle obs) {
        if (!isOn || pilot == null) return;

        boolean result = pilot.tryDodge(obs);
        String outcome = result ? "dodged" : "failed to dodge";
        System.out.println("Eva Unit-" + unitNumber + " (" + syncLevel + " sync) " + outcome + " " + obs);
    }
}
