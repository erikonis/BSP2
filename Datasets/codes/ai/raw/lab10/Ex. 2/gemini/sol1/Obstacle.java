public abstract class Obstacle {
    private String name;
    private int mentalToll;

    public Obstacle(String name, int mentalToll) {
        if (mentalToll < 0 || mentalToll > 100) {
            throw new IllegalArgumentException("Mental toll must be between 0 and 100 (inclusive).");
        }
        this.name = name;
        this.mentalToll = mentalToll;
    }

    public String getName() {
        return name;
    }

    public int getMentalToll() {
        return mentalToll;
    }
}