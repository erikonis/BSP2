class DummyPilot extends Pilot {
    public DummyPilot(String name, int compatibility) {
        super(name, compatibility);
    }

    @Override
    public int getEffectiveCompatibility() {
        return compatibility - (int)(Math.random() * 6);
    }

    @Override
    public boolean canManeuver() {
        return true;
    }

    @Override
    public int performManeuver(Obstacle obstacle) {
        return (int)(Math.random() * 101);
    }

    @Override
    public String toString() {
        return "(Dummy) " + name + " (" + compatibility + " compatibility)";
    }
}