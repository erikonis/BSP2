public class Robot {
    private int x, y;
    private int battery = 3000;
    private boolean hasRock, hasAlienPhoto;
    
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
    
    public void consumeBattery(int amount) {
        battery = Math.max(0, battery - amount);
    }
    
    // Getters and status methods
    public int getX() { return x; }
    public int getY() { return y; }
    public int getBattery() { return battery; }
    public boolean hasRock() { return hasRock; }
    public boolean hasAlienPhoto() { return hasAlienPhoto; }
    
    public void pickRock() {
        if (x == 3 && y == 2) hasRock = true;
    }
    
    public void takePhoto(boolean highRes) {
        if (x == 5 && y == 5) hasAlienPhoto = true;
    }
    
    public boolean missionComplete() {
        return x == 7 && y == 6 && hasRock && hasAlienPhoto;
    }
}