import java.util.Random;

public class DummyPilot extends Pilot {
    public DummyPilot(String name, int compatibility) {
        super(name, compatibility);
        this.compatibility -= new Random().nextInt(6); // Random 0-5 drop
    }

    @Override
    public boolean canStart() {
        return true;
    }

    @Override
    public void afterStart() {
        // No effect
    }

    @Override
    public boolean tryDodge(Obstacle obs) {
        return new Random().nextInt(101) >= 50;
    }

    @Override
    public String toString() {
        return "(Dummy) " + name + " (" + compatibility + " compatibility)";
    }
}