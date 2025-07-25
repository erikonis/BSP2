import java.util.Random;

public class HumanPilotBehavior implements PilotBehavior {
    private static final Random random = new Random();
    private int sanity = 100;

    @Override
    public int calculateEffectiveCompatibility(int baseCompatibility) {
        return baseCompatibility; // No reduction for humans
    }

    @Override
    public int performManeuverRoll(Obstacle obstacle) {
        if (sanity <= 0) return 0;

        int roll = random.nextInt(101);
        sanity -= obstacle.getMentalToll();
        sanity = Math.max(0, sanity);
        return roll + 20; // Human bonus
    }

    @Override
    public void onStartAttempt() {
        sanity -= 5;
    }

    @Override
    public boolean isOperational() {
        return sanity > 0;
    }

    public int getSanity() {
        return sanity;
    }
}