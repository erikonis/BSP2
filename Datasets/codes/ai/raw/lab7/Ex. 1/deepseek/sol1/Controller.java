import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final Robot robot;
    private final List<Action> actionQueue;
    
    public Controller(Robot robot) {
        this.robot = robot;
        this.actionQueue = new ArrayList<>();
    }
    
    public void addAction(Action action) {
        if (actionQueue.size() < 10) {
            actionQueue.add(action);
        } else {
            System.out.println("Action queue full (max 10 actions)");
        }
    }
    
    public void executeActions() {
        for (Action action : actionQueue) {
            if (robot.getBattery() <= 0) {
                System.out.println("Robot battery depleted!");
                break;
            }
            
            System.out.println("\nExecuting: " + action.getDescription());
            action.execute(robot);
            System.out.println("Battery used: " + action.getBatteryCost() + "s");
            robot.printStatus();
            
            if (robot.hasCompletedMission()) {
                System.out.println("\nMISSION COMPLETE!");
                break;
            }
        }
        
        System.out.println("\n=== Final Status ===");
        robot.printStatus();
        System.out.println("Total actions executed: " + actionQueue.size());
    }
}