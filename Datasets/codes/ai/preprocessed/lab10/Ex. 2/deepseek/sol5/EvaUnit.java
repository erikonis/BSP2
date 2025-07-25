import evangelion.contracts.Pilotable;
import evangelion.contracts.Maneuverable;
import evangelion.pilots.Pilot;
import evangelion.obstacles.Obstacle;

public abstract class EvaUnit<T extends Pilot> implements Pilotable<T>, Maneuverable {
    protected final int unitNumber;
    protected T pilot;
    protected int syncLevel;
    protected boolean active;

    public EvaUnit(int unitNumber, int syncLevel) {
        this.unitNumber = unitNumber;
        this.syncLevel = Math.max(0, Math.min(100, syncLevel));
        this.active = false;
    }

    @Override
    public void assignPilot(T pilot) {
        this.pilot = pilot;
        System.out.println(this + " assigned pilot: " + pilot.getName());
    }

    @Override
    public boolean start() {
        if (pilot == null) {
            System.out.println(this + " cannot start - no pilot!");
            return false;
        }

        int stability = 100 - Math.abs(syncLevel - pilot.getCompatibility());
        boolean success = (Math.random() * 100) <= stability;

        if (success) {
            active = true;
            pilot.onEvaStart();
            System.out.println(this + " successfully started!");
        } else {
            System.out.println(this + " failed to start!");
        }

        return success;
    }

    @Override
    public boolean maneuver(Obstacle obstacle) {
        if (!isOperational()) return false;

        int roll = pilot.calculateManeuverRoll(obstacle);
        boolean success = roll >= 50;

        pilot.onManeuver(obstacle);
        System.out.println(this + " maneuver attempt (" + roll + " vs " + obstacle + "): " +
                          (success ? "SUCCESS" : "FAIL"));

        return success;
    }

    @Override
    public boolean isOperational() {
        return active;
    }

    @Override
    public String toString() {
        return "Eva-" + unitNumber + " (Sync: " + syncLevel + ")";
    }
}