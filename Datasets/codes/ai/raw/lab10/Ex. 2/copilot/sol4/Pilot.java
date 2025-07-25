public abstract class Pilot {
    protected String name;
    protected int compatibility;

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
}