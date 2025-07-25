import java.util.Random;

public class DummyPilotBehavior implements PilotBehavior {
    private static final Random random = new Random();

    @Override
    public int calculateEffectiveCompatibility(int baseCompatibility) {
        int reduction = random.nextInt(6);
        return Math.max(0, baseCompatibility - reduction);
    }

    @Override
    public int performManeuverRoll(Obstacle obstacle) {
        return random.nextInt(101); // No bonus
    }

    @Override
    public void onStartAttempt() {
        // Dummy system doesn't get stressed
    }

    @Override
    public boolean isOperational() {
        return true; // Dummy system never breaks down
    }
}