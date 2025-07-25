import java.util.List;

public class Controller {
    private List<Action> actions;

    public Controller(List<Action> actions) {
        this.actions = actions;
    }

    public void executeActions(Robot robot) {
        for (Action action : actions) {
            action.execute(robot);
        }
        System.out.println("Total actions performed: " + actions.size());
        System.out.println("Remaining battery life: " + robot.getBatteryLife() + " seconds.");
    }
}