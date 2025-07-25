public class Robot {
    private int batteryLife = 3000;

    public void moveForward() {
        System.out.println("Moved forward.");
    }

    public void moveLeft() {
        System.out.println("Moved left.");
    }

    public void takePhoto(boolean highResolution) {
        System.out.println("Took " + (highResolution ? "high resolution" : "low resolution") + " photo.");
    }

    public void pickRock() {
        System.out.println("Picked up a rock.");
    }

    public void consumeBattery(int amount) {
        batteryLife -= amount;
        System.out.println("Battery life remaining: " + batteryLife + " seconds.");
    }

    public int getBatteryLife() {
        return batteryLife;
    }
}