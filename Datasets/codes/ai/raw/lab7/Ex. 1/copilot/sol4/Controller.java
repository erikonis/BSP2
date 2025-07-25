// Controller.java
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Action> actions = new ArrayList<>();

    public void addAction(Action action) {
        if (actions.size() < 10) {
            actions.add(action);
        } else {
            System.out.println("Action limit reached");
        }
    }

    public void executeActions(Robot robot) {
        for (Action action : actions) {
            action.execute(robot);
            System.out.println("Battery life remaining: " + robot.getBatteryLife() + " seconds");
        }
        System.out.println("Total actions performed: " + actions.size());
        System.out.println("Final battery life: " + robot.getBatteryLife() + " seconds");
    }
}
