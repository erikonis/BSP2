import java.util.concurrent.ThreadLocalRandom;

public class HumanPilot implements Pilot {
    private final String name;
    private final int baseCompatibility;
    private int sanity;

    public HumanPilot(String name, int compatibility, int sanity) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Pilot name cannot be empty");
        }
        if (compatibility < 0 || compatibility > 100) {
            throw new IllegalArgumentException("Compatibility must be between 0-100");
        }
        if (sanity < 0 || sanity > 100) {
            throw new IllegalArgumentException("Sanity must be between 0-100");
        }

        this.name = name;
        this.baseCompatibility = compatibility;
        this.sanity = sanity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCompatibility() {
        return baseCompatibility; // Human pilots use base compatibility without random reduction
    }

    @Override
    public int getSanity() {
        return sanity;
    }

    @Override
    public boolean canOperate() {
        return sanity > 0;
    }

    @Override
    public void onStartAttempt() {
        sanity = Math.max(0, sanity - 5); // Loses 5 sanity when attempting to start
    }

    @Override
    public int rollManeuver(Obstacle obstacle) {
        if (sanity <= 0) return 0;
        int roll = ThreadLocalRandom.current().nextInt(101);
        sanity = Math.max(0, sanity - obstacle.getMentalToll());
        return roll + 20; // Human pilots get +20 bonus
    }

    public int getBaseCompatibility() {
        return baseCompatibility;
    }

    @Override
    public String toString() {
        return String.format("%s (Human Pilot) - Compatibility: %d, Sanity: %d",
                           name, baseCompatibility, sanity);
    }
}