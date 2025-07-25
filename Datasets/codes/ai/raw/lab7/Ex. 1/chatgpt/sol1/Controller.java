public class Controller {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Controller controller = new Controller();

        Action[] actions = { new GoForward(), new PickRock(), new TakePhoto(true) };
        controller.executeActions(robot, actions);
    }

    public void executeActions(Robot robot, Action[] actions) {
        for (Action action : actions) {
            robot.executeAction(action);
        }
    }
}