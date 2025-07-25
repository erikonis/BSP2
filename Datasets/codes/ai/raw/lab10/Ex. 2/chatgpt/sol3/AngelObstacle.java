public class AngelObstacle extends Obstacle {
    private final int mentalToll;

    public AngelObstacle(int toll) {
        this.mentalToll = toll;
    }

    @Override
    public int getMentalToll() {
        return mentalToll;
    }

    @Override
    public String toString() {
        return "Angel Obstacle (" + mentalToll + ")";
    }
}
