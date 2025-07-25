public class Robot {
    private int batteryLife = 3000;

    public void moveLeft() {
        batteryLife -= 10;
        System.out.println("Moved left. Battery life: " + batteryLife);
    }

    public void moveRight() {
        batteryLife -= 10;
        System.out.println("Moved right. Battery life: " + batteryLife);
    }

    public void moveForward() {
        batteryLife -= 10;
        System.out.println("Moved forward. Battery life: " + batteryLife);
    }

    public void moveBack() {
        batteryLife -= 10;
        System.out.println("Moved back. Battery life: " + batteryLife);
    }

    public void takePhoto(boolean highResolution) {
        batteryLife -= highResolution ? 60 : 40;
        System.out.println("Took " + (highResolution ? "high resolution" : "low resolution") + " photo. Battery life: " + batteryLife);
    }

    public void pickRock() {
        batteryLife -= 150;
        System.out.println("Picked a rock. Battery life: " + batteryLife);
    }

    public int getBatteryLife() {
        return batteryLife;
    }
}