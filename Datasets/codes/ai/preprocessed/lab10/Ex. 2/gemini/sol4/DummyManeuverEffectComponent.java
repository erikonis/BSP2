import java.util.Random;

public class DummyManeuverEffectComponent implements PilotComponent {
    private final Random random = new Random();

    @Override
    public boolean onStart(EvaUnit<?> unit, Pilot pilot, int stability, int roll) {
        return true; // Doesn't affect start
    }

    @Override
    public boolean onManeuver(EvaUnit<?> unit, Pilot pilot, Obstacle obstacle) {
        return random.nextInt(101) >= 50;
    }
}