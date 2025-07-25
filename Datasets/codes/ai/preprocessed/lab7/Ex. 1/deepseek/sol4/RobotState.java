public class RobotState {
    private int x;
    private int y;
    private int battery;
    private boolean hasRock;
    private boolean hasAlienPhoto;

    public RobotState() {
        this.battery = 3000;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void consumeBattery(int amount) {
        battery = Math.max(0, battery - amount);
    }

    // Getters and setters
    public int getX() { return x; }
    public int getY() { return y; }
    public int getBattery() { return battery; }
    public boolean hasRock() { return hasRock; }
    public boolean hasAlienPhoto() { return hasAlienPhoto; }
    public void setHasRock(boolean hasRock) { this.hasRock = hasRock; }
    public void setHasAlienPhoto(boolean hasAlienPhoto) { this.hasAlienPhoto = hasAlienPhoto; }
}