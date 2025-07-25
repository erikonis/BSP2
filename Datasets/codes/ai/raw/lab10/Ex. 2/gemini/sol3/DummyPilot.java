import java.util.Random;
import java.util.function.BiFunction;

public class DummyPilot extends Pilot {
    private final Random random = new Random();

    public DummyPilot(String name, int intendedCompatibility) {
        super(name, Math.max(0, intendedCompatibility - random.nextInt(6)),
              (unit, roll) -> roll <= Math.abs(unit.getSynchronizationLevel() - unit.getPilot().getCompatibility()),
              (unit, obstacle) -> new Random().nextInt(101) >= 50,
              null, // No sanity reducer
              null, // No sanity getter
              null // Always can act
        );
    }
}