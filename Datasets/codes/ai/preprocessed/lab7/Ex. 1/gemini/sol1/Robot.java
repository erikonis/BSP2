import java.util.ArrayList;
import java.util.List;

public class Robot {
    private int batteryLife;

    public Robot(int initialBattery) {
        this.batteryLife = initialBattery;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void decreaseBattery(int amount) {
        this.batteryLife -= amount;
        if (this.batteryLife < 0) {
            System.out.println("Battery depleted! Robot cannot perform further actions.");
            this.batteryLife = 0;
        }
    }

    public void performAction(Action action) {
        if (batteryLife > 0) {
            System.out.println("Executing action: " + action.getName() + " (Cost: " + action.getCost() + " seconds)");
            action.execute(this);
            System.out.println("Remaining battery: " + getBatteryLife() + " seconds.");
        } else {
            System.out.println("Cannot perform action: " + action.getName() + ". Battery is empty.");
        }
    }
}