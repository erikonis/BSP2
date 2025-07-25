import java.util.concurrent.ThreadLocalRandom;

public class DummyPilot implements Pilot {
    private final String name;
    private final int baseCompatibility;

    public DummyPilot(String name, int compatibility) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Pilot name cannot be empty");
        }
        if (compatibility < 0 || compatibility > 100) {
            throw new IllegalArgumentException("Compatibility must be between 0-100");
        }

        this.name = name;
        this.baseCompatibility = compatibility;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCompatibility() {
        // Dummy system has random compatibility reduction (0-5)
        int reduction = ThreadLocalRandom.current().nextInt(6);
        return Math.max(0, baseCompatibility - reduction);
    }

    @Override
    public int getSanity() {
        return 0; // Dummy system has no sanity
    }

    @Override
    public boolean canOperate() {
        return true; // Dummy system never breaks down
    }

    @Override
    public void onStartAttempt() {
        // Dummy system doesn't get stressed
    }

    @Override
    public int rollManeuver(Obstacle obstacle) {
        // No sanity effects or bonuses for dummy system
        return ThreadLocalRandom.current().nextInt(101);
    }

    public int getBaseCompatibility() {
        return baseCompatibility;
    }

    @Override
    public String toString() {
        return String.format("%s (Dummy System) - Base Compatibility: %d",
                           name, baseCompatibility);
    }
}