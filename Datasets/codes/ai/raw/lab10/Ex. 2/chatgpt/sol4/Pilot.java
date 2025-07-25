public abstract class Pilot {
    protected final String name;
    protected int compatibility;

    public Pilot(String name, int compatibility) {
        this.name = name;
        this.compatibility = compatibility;
    }

    public abstract boolean canStart();
    public abstract void afterStart();
    public abstract boolean tryDodge(Obstacle obs);

    public int getCompatibility() {
        return compatibility;
    }

    @Override
    public String toString() {
        return name + " (" + compatibility + " compatibility)";
    }
}
