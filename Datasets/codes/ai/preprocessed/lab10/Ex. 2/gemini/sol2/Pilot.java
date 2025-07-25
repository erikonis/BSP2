import java.util.Random;

public abstract class Pilot {
    private String name;
    private int compatibility;

    public Pilot(String name, int compatibility) {
        if (compatibility < 0 || compatibility > 100) {
            throw new IllegalArgumentException("Compatibility must be between 0 and 100 (inclusive).");
        }
        this.name = name;
        this.compatibility = compatibility;
    }

    public String getName() {
        return name;
    }

    public int getCompatibility() {
        return compatibility;
    }

    protected void reduceCompatibility(int amount) {
        this.compatibility = Math.max(0, this.compatibility - amount);
    }
}