import java.util.Random;

public class AngelObstacle extends Obstacle {
    private Random random = new Random();

    public AngelObstacle() {
        this.mentalToll = random.nextInt(101); // Mental toll ranges from 0 to 100
    }
}