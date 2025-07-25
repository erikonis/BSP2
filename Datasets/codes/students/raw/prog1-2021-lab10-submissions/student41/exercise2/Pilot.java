package lu.uni.programming1.lab10.exercise2;

public abstract class Pilot {
    private String name;
    private int compatibility;

    public Pilot(String name, int compatibility) {
        this.name = name;
        this.compatibility = Math.max(0, Math.min(100, compatibility));
    }

    public String getName() {
        return name;
    }

    public int getCompatibility() {
        return compatibility;
    }

    public void setCompatibility(int compatibility) {
        this.compatibility = compatibility;
    }

    public void setSanity(int s) {

    }

    public int getSanity() {
        return 0;

    }

    @Override
    public String toString() {
        return name + " (" + compatibility + " compatibility)";
    }

    public abstract String classString();

}
