public class Robot {
    private int batteryLife = 3000;

    public void executeAction(Action action) {
        if (batteryLife > 0) {
            action.execute(this);
            batteryLife -= action.getTimeCost();
            System.out.println("Battery left: " + batteryLife + " seconds.");
        } else {
            System.out.println("Battery drained.");
        }
    }

    public void moveForward() {
        System.out.println("Robot moves forward.");
    }

    public void moveLeft() {
        System.out.println("Robot moves left.");
    }

    public void moveRight() {
        System.out.println("Robot moves right.");
    }
}