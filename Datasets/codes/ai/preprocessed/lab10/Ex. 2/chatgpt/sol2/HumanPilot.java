class HumanPilot extends Pilot {
    private int sanity = 100;

    public HumanPilot(String name, int compatibility) {
        super(name, compatibility);
    }

    @Override
    public int getEffectiveCompatibility() {
        return compatibility;
    }

    @Override
    public boolean canManeuver() {
        return sanity > 0;
    }

    @Override
    public int performManeuver(Obstacle obstacle) {
        if (sanity == 0) return 0;
        sanity -= obstacle.getMentalToll();
        if (sanity < 0) sanity = 0;
        return (int) (Math.random() * 101) + 20;
    }

    public void reduceSanity(int value) {
        sanity -= value;
        if (sanity < 0) sanity = 0;
    }

    public int getSanity() { return sanity; }

    @Override
    public String toString() {
        return "(Human) " + name + " (" + compatibility + " compatibility) (" + sanity + " sanity)";
    }
}