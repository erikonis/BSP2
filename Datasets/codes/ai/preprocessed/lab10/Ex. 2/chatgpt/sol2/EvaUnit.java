class EvaUnit<T extends Pilot> {
    private int unitNumber;
    private T pilot;
    private int syncLevel;
    private boolean isOn = false;

    public EvaUnit(int unitNumber, int syncLevel) {
        this.unitNumber = unitNumber;
        this.syncLevel = syncLevel;
    }

    public void assignPilot(T pilot) {
        this.pilot = pilot;
        System.out.println("Eva Unit-" + unitNumber + " (" + syncLevel + " sync) is now piloted by " + pilot);
    }

    public void start() {
        if (pilot == null) {
            System.out.println("Eva Unit-" + unitNumber + " (" + syncLevel + " sync) can't start: no pilot present.");
            return;
        }
        if (pilot instanceof HumanPilot) {
            ((HumanPilot) pilot).reduceSanity(5);
            if (((HumanPilot) pilot).getSanity() == 0) {
                System.out.println(pilot + " has lost their sanity.");
            }
        }
        int stability = 100 - Math.abs(syncLevel - pilot.getEffectiveCompatibility());
        int roll = (int) (Math.random() * 101);
        if (roll <= stability) {
            isOn = true;
            System.out.println("Start sequence for Eva Unit-" + unitNumber + " (" + syncLevel + " sync): Started!");
        } else {
            System.out.println("Start sequence for Eva Unit-" + unitNumber + " (" + syncLevel + " sync): Failed!");
        }
    }

    public void maneuver(Obstacle obstacle) {
        if (!isOn || pilot == null || !pilot.canManeuver()) {
            System.out.println("Eva Unit-" + unitNumber + " (" + syncLevel + " sync) failed to dodge " + obstacle);
            return;
        }
        int roll = pilot.performManeuver(obstacle);
        if (roll >= 50) {
            System.out.println("Eva Unit-" + unitNumber + " (" + syncLevel + " sync) dodged " + obstacle);
        } else {
            System.out.println("Eva Unit-" + unitNumber + " (" + syncLevel + " sync) failed to dodge " + obstacle);
        }
    }
}