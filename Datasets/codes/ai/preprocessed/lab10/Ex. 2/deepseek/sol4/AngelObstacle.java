public class AngelObstacle extends Obstacle {
    private int mentalToll;

    public AngelObstacle(int mentalToll) {
        this.mentalToll = Math.max(0, Math.min(100, mentalToll));
    }

    @Override
    public int getMentalToll() { return mentalToll; }

    @Override
    public String toString() {
        return "Angel Obstacle (" + mentalToll + ")";
    }
}