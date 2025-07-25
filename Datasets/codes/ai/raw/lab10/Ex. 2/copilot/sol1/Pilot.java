public abstract class Pilot {
    private String name;
    private int compatibility;

    public Pilot(String name, int compatibility) {
        this.name = name;
        this.compatibility = compatibility;
    }

    public String getName() {
        return name;
    }

    public int getCompatibility() {
        return compatibility;
    }

    public abstract void adjustCompatibility();

    @Override
    public String toString() {
        return name + " (Compatibility: " + compatibility + ")";
    }
}
