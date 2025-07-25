import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final Robot robot;
    private final List<Action> actions = new ArrayList<>();

    public Controller(Robot robot) {
        this.robot = robot;
    }

    public void addAction(Action action) {
        if (actions.size() < 10) {
            actions.add(action);
        }
    }

    public void execute() {
        for (Action action : actions) {
            if (robot.getBattery() <= 0) break;

            action.execute(robot);
            robot.consumeBattery(action.getBatteryCost());

            System.out.println(action + " | Position: (" +
                robot.getX() + "," + robot.getY() + ") | Battery: " +
                robot.getBattery() + "s");

            if (robot.missionComplete()) {
                System.out.println("MISSION COMPLETE!");
                break;
            }
        }
    }
}