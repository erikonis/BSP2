// Robot.java
public class Robot {
    private int batteryLife = 3000;

    public void moveForward() {
        System.out.println("Moved forward");
        batteryLife -= 10;
    }

    public void moveLeft() {
        System.out.println("Moved left");
        batteryLife -= 10;
    }

    public void moveRight() {
        System.out.println("Moved right");
        batteryLife -= 10;
    }

    public void moveBack() {
        System.out.println("Moved back");
        batteryLife -= 10;
    }

    public void takePhoto(boolean highResolution) {
        System.out.println("Took " + (highResolution ? "high resolution" : "low resolution") + " photo");
        batteryLife -= highResolution ? 60 : 40;
    }

    public void pickRock() {
        System.out.println("Picked up a rock");
        batteryLife -= 150;
    }

    public int getBatteryLife() {
        return batteryLife;
    }
}
