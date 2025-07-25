import java.util.List;

public class Controller {
    private Robot robot;

    public Controller(Robot robot) {
        this.robot = robot;
    }

    public void executeActions(List<Action> actions) {
        for (Action action : actions) {
            if (robot.getBatteryLife() >= action.getTimeCost()) {
                action.execute(robot);
                System.out.println("Battery remaining: " + robot.getBatteryLife() + " seconds");
            } else {
                System.out.println("Not enough battery for this action!");
            }
        }
    }
}
