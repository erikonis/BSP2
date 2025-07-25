package exercise1;

public class Move extends Action {

    private String direction;
    private int neededBatteryLife = 10;

    public Move(int neededBatteryLife, String direction) {
        super("move " + direction, neededBatteryLife);
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Move [direction=" + direction + ", neededBatteryLife=" + neededBatteryLife + "]";
    }
}
