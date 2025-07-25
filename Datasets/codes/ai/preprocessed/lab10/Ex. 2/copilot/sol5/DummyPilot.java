import java.util.Random;

public class DummyPilot implements Pilot {
    private String name;
    private int compatibility;
    private Random random = new Random();

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
        compatibility -= random.nextInt(6); // Reduce compatibility by 0 to 5
    }
}