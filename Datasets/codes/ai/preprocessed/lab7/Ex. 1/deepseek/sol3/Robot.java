public class Robot {
    private int x, y;
    private int battery;
    private boolean hasRock;
    private boolean hasAlienPhoto;

    public Robot() {
        this.battery = 3000;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void consumeBattery(int amount) {
        battery = Math.max(0, battery - amount);
    }

    // Getters and state methods
    public int getX() { return x; }
    public int getY() { return y; }
    public int getBattery() { return battery; }
    public boolean hasRock() { return hasRock; }
    public boolean hasAlienPhoto() { return hasAlienPhoto; }
    public void setRock(boolean has) { hasRock = has; }
    public void setAlienPhoto(boolean has) { hasAlienPhoto = has; }
}