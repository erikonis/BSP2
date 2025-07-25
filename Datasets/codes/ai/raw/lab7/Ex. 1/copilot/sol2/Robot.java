public class Robot {
    private int batteryLife;
    private int x;
    private int y;

    public Robot() {
        this.batteryLife = 3000;
        this.x = 0;
        this.y = 0;
    }

    public void move(String direction) {
        switch (direction) {
            case "left":
                x -= 1;
                break;
            case "right":
                x += 1;
                break;
            case "forward":
                y += 1;
                break;
            case "back":
                y -= 1;
                break;
        }
    }

    public void takePhoto(String resolution) {
        // Simulate taking a photo
    }

    public void pickRock() {
        // Simulate picking a rock
    }

    public void decreaseBattery(int amount) {
        batteryLife -= amount;
    }

    public int getBatteryLife() {
        return batteryLife;
    }
}
