public class DummyStartEffectComponent implements PilotComponent {
    private final java.util.Random random = new java.util.Random();

    @Override
    public boolean onStart(EvaUnit<?> unit, Pilot pilot, int stability, int roll) {
        return roll <= stability;
    }

    @Override
    public boolean onManeuver(EvaUnit<?> unit, Pilot pilot, Obstacle obstacle) {
        return true; // Doesn't affect maneuver
    }
}