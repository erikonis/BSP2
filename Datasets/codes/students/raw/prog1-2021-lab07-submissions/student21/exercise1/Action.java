package exercise1;

public class Action {
    private String action;
    private int neededBatteryLife;

    public Action(String action, int neededBatteryLife) {
        this.action = action;
        this.neededBatteryLife = neededBatteryLife;
    }

    public String getAction() {
        return action;
    }

    public int getConsumedBattery(){
        return neededBatteryLife;
    }

    @Override
    public String toString() {
        return "Action [action=" + action + ", neededBatteryLife=" + neededBatteryLife + "]";
    }
}
