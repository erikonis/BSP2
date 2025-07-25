import java.util.Random;

public class DummyPilot implements Pilot {
    private String name;
    private int compatibility;

    public DummyPilot(String name, int compatibility) {
        this.name = name;
        this.compatibility = compatibility;
        adjustCompatibility();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCompatibility() {
        return compatibility;
    }

    @Override
    public void adjustCompatibility() {
        int reduction = new Random().nextInt(6); // Random reduction between 0 and 5
        compatibility = Math.max(compatibility - reduction, 0);
    }

    @Override
    public void performAction(EvaUnit<?> evaUnit, Obstacle obstacle) {
        int roll = new Random().nextInt(101);
        if (roll >= 50) {
            System.out.println(name + " successfully maneuvered the obstacle.");
        } else {
            System.out.println(name + " failed to maneuver the obstacle.");
        }
    }

    @Override
    public String toString() {
        return name + " (Compatibility: " + compatibility + ", Dummy Pilot)";
    }
}