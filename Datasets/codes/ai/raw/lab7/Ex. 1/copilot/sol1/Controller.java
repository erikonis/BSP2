import java.util.List;
import java.util.ArrayList;

public class Controller {
    private List<Action> actions = new ArrayList<>();

    public void addAction(Action action) {
        if (actions.size() < 10) {
            actions.add(action);
        } else {
            System.out.println("Action limit reached.");
        }
    }

    public void executeActions(Robot robot) {
        for (Action action : actions) {
            action.execute(robot);
        }
        System.out.println("Total actions performed: " + actions.size());
        System.out.println("Remaining battery life: " + robot.getBatteryLife());
    }
}
