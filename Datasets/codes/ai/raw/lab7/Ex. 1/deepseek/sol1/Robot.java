public class Robot {
    private int x;
    private int y;
    private int battery;
    private boolean hasRock;
    private boolean hasAlienPhoto;
    
    public Robot() {
        this.x = 0;
        this.y = 0;
        this.battery = 3000; // Initial battery life
        this.hasRock = false;
        this.hasAlienPhoto = false;
    }
    
    public void moveForward() {
        y++;
        System.out.println("Moved forward to (" + x + "," + y + ")");
    }
    
    public void moveBack() {
        y--;
        System.out.println("Moved back to (" + x + "," + y + ")");
    }
    
    public void moveLeft() {
        x--;
        System.out.println("Moved left to (" + x + "," + y + ")");
    }
    
    public void moveRight() {
        x++;
        System.out.println("Moved right to (" + x + "," + y + ")");
    }
    
    public void takePhoto(boolean highResolution) {
        System.out.println("Taken " + (highResolution ? "high" : "low") + " resolution photo");
        if (x == 5 && y == 3) { // Alien position
            hasAlienPhoto = true;
            System.out.println("Captured alien in photo!");
        }
    }
    
    public void pickRock() {
        if (x == 3 && y == 2) { // Rock position
            hasRock = true;
            System.out.println("Picked up a rock sample!");
        } else {
            System.out.println("No rock here to pick up");
        }
    }
    
    public void consumeBattery(int amount) {
        battery -= amount;
        if (battery < 0) battery = 0;
    }
    
    public int getBattery() {
        return battery;
    }
    
    public boolean hasCompletedMission() {
        return hasRock && hasAlienPhoto && x == 7 && y == 5; // Finish position
    }
    
    public void printStatus() {
        System.out.println("Position: (" + x + "," + y + ")");
        System.out.println("Battery: " + battery + "s remaining");
        System.out.println("Has rock: " + hasRock);
        System.out.println("Has alien photo: " + hasAlienPhoto);
    }
}