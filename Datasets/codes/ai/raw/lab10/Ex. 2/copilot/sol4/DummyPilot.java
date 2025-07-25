import java.util.Random;

public class DummyPilot extends Pilot {
    private Random random = new Random();

    public DummyPilot(String name, int compatibility) {
        super(name, compatibility);
        adjustCompatibility();
    }

    @Override
    public void adjustCompatibility() {
        compatibility -= random.nextInt(6); // Reduce compatibility by 0 to 5
    }
}