import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Controller controller = new Controller(robot);

        // Define actions
        List<Action> actions = new ArrayList<>();
        actions.add(new GoForward());
        actions.add(new GoLeft());
        actions.add(new GoLeft());
        actions.add(new GoForward());
        actions.add(new PickRock());
        actions.add(new GoForward());
        actions.add(new TakePhoto(true));  // Take high-resolution photo
        actions.add(new GoLeft());
        actions.add(new GoForward());
        actions.add(new GoLeft());

        // Execute actions
        controller.executeActions(actions);

        // Final state of the robot
        System.out.println("Final Battery Life: " + robot.getBatteryLife() + " seconds");
        System.out.println("Robot position: (" + robot.getX() + ", " + robot.getY() + ")");
        System.out.println("Has rock: " + robot.hasRock());
        System.out.println("Has photo: " + robot.hasPhoto());
    }
}
