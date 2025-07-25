abstract class Pilot {
    protected String name;
    protected int compatibility;

    public Pilot(String name, int compatibility) {
        this.name = name;
        this.compatibility = compatibility;
    }

    public abstract int getEffectiveCompatibility();
    public String getName() { return name; }
    public int getCompatibility() { return compatibility; }
    public abstract boolean canManeuver();
    public abstract int performManeuver(Obstacle obstacle);
}