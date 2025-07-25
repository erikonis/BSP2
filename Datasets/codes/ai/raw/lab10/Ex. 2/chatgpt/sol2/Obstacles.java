class ObjectObstacle implements Obstacle {
    public int getMentalToll() { return 0; }
    public String toString() { return "Object Obstacle (0)"; }
}

class AngelObstacle implements Obstacle {
    private int mentalToll;
    public AngelObstacle(int mentalToll) {
        this.mentalToll = mentalToll;
    }
    public int getMentalToll() { return mentalToll; }
    public String toString() { return "Angel Obstacle (" + mentalToll + ")"; }
}