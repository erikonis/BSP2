import java.util.Random;

public class DummyPilot extends Pilot {
    private final Random random = new Random();

    public DummyPilot(String name, int intendedCompatibility) {
        super(name, Math.max(0, intendedCompatibility - random.nextInt(6)));
    }

    @Override
    public PilotType getType() {
        return PilotType.DUMMY;
    }
}