import java.util.Random;

public class AngelObstacle implements Obstacle {
    private static final Random random = new Random();
    private final int mentalToll;

    public AngelObstacle() {
        this.mentalToll = random.nextInt(101);
    }

    @Override
    public int getMentalToll() {
        return mentalToll;
    }

    @Override
    public String getDescription() {
        return String.format("Angel (Mental Toll: %d)", mentalToll);
    }
}