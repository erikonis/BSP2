public class Robot {
    private int batteryLife;
    private int x, y; // Position in the maze
    private boolean hasRock;
    private boolean hasPhoto;

    public Robot() {
        this.batteryLife = 3000; // Start with 3000 seconds of battery
        this.x = 0;
        this.y = 0;
        this.hasRock = false;
        this.hasPhoto = false;
    }

    public void moveForward() {
        if (batteryLife >= 10) {
            y++;
            batteryLife -= 10;
        } else {
            System.out.println("Not enough battery to move forward.");
        }
    }

    public void moveLeft() {
        if (batteryLife >= 10) {
            x--;
            batteryLife -= 10;
        } else {
            System.out.println("Not enough battery to move left.");
        }
    }

    public void pickRock() {
        if (batteryLife >= 150 && !hasRock) {
            hasRock = true;
            batteryLife -= 150;
        } else {
            System.out.println("Not enough battery to pick a rock or rock already picked.");
        }
    }

    public void takePhoto(boolean highResolution) {
        if (batteryLife >= (highResolution ? 60 : 40)) {
            hasPhoto = true;
            batteryLife -= (highResolution ? 60 : 40);
        } else {
            System.out.println("Not enough battery to take a photo.");
        }
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean hasRock() {
        return hasRock;
    }

    public boolean hasPhoto() {
        return hasPhoto;
    }
}
