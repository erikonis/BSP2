import java.util.Random;

public class DummyPilot extends Pilot {
    private static final Random RANDOM = new Random();

    public DummyPilot(String name, int compatibility) {
        super(name, compatibility);
        adjustCompatibility();
    }

    @Override
    public void adjustCompatibility() {
        int reduction = RANDOM.nextInt(6); // Random reduction between 0 and 5
        int newCompatibility = Math.max(getCompatibility() - reduction, 0);
        // Update compatibility with the reduced value
    }

    @Override
    public String toString() {
        return super.toString() + " (Dummy Pilot)";
    }
}