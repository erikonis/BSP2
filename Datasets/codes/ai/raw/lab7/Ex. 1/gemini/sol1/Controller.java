// Controller.java
import java.util.List;

public class Controller {
    public void executeActions(Robot robot, List<Action> actions) {
        System.out.println("\n--- Executing Sequence of Actions ---");
        int actionsPerformed = 0;
        for (Action action : actions) {
            if (robot.getBatteryLife() > 0) {
                robot.performAction(action);
                actionsPerformed++;
            } else {
                System.out.println("Robot stopped due to empty battery.");
                break;
            }
        }
        System.out.println("\n--- Execution Summary ---");
        System.out.println("Total actions attempted: " + actions.size());
        System.out.println("Number of actions successfully performed: " + actionsPerformed);
        System.out.println("Final battery life: " + robot.getBatteryLife() + " seconds.");
    }
}