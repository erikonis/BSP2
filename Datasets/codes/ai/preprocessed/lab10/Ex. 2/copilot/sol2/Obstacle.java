public abstract class Obstacle {
    private int mentalToll;

    public Obstacle(int mentalToll) {
        this.mentalToll = mentalToll;
    }

    public int getMentalToll() {
        return mentalToll;
    }

    @Override
    public String toString() {
        return "Obstacle (Mental Toll: " + mentalToll + ")";
    }
}