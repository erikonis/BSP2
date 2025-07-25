import java.util.Random;

public class DummyPilot implements Pilot {
    private final String name;
    private final int compatibility;

    public DummyPilot(String name, int compatibility) {
        this.name = name;
        this.compatibility = compatibility - new Random().nextInt(6); // Random 0-5 drop
    }

    @Override
    public boolean canStart() {
        return true;
    }

    @Override
    public void afterStart() {
        // No effect for dummy pilots
    }

    @Override
    public boolean tryDodge(Obstacle obs) {
        return new Random().nextInt(101) >= 50;
    }

    @Override
    public int getCompatibility() {
        return compatibility;
    }

    @Override
    public String toString() {
        return "(Dummy) " + name + " (" + compatibility + " compatibility)";
    }
}