public class AngelObstacle extends Obstacle {
    public AngelObstacle(int mentalToll) {
        super(mentalToll);
    }

    @Override
    public String toString() {
        return "Angel Obstacle (Mental Toll: " + getMentalToll() + ")";
    }
}