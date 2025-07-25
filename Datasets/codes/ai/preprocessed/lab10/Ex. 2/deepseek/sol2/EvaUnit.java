public class EvaUnit {
    private final int unitNumber;
    private final Pilot pilot;
    private final int syncLevel;
    private boolean active;

    public EvaUnit(int unitNumber, Pilot pilot, int syncLevel) {
        this.unitNumber = unitNumber;
        this.pilot = pilot;
        this.syncLevel = syncLevel;
        this.active = false;
    }

    public int getUnitNumber() { return unitNumber; }
    public Pilot getPilot() { return pilot; }
    public int getSyncLevel() { return syncLevel; }
    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}