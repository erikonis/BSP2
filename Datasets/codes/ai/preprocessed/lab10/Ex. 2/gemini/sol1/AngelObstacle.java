import java.util.Random;

public class AngelObstacle extends Obstacle {
    private final Random random = new Random();

    public AngelObstacle(String name) {
        super(name, new Random().nextInt(101));
    }

    public AngelObstacle(String name, int mentalToll) {
        super(name, mentalToll);
    }
}