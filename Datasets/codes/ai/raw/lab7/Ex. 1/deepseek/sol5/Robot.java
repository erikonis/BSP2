public class Robot {
    private int x, y;
    private int battery = 3000;
    private boolean hasRock, hasAlienPhoto;
    
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
        battery -= 10;
    }
    
    public void takePhoto(boolean highRes) {
        battery -= highRes ? 60 : 40;
        if (x == 5 && y == 5) hasAlienPhoto = true;
    }
    
    public void pickRock() {
        battery -= 150;
        if (x == 3 && y == 2) hasRock = true;
    }
    
    public boolean missionComplete() {
        return x == 7 && y == 6 && hasRock && hasAlienPhoto;
    }
    
    // Getters
    public int getX() { return x; }
    public int getY() { return y; }
    public int getBattery() { return battery; }
}