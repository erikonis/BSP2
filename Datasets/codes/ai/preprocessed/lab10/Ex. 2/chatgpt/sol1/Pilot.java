public abstract class Pilot {
    protected String name;
    protected int compatibility; // Compatibility from 0 to 100

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
}