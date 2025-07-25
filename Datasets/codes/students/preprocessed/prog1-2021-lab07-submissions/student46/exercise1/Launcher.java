public class Launcher {
    public static void main(String[] args) {
        Controller controller = new Controller(new Robot());

        controller.goForward();
        controller.goLeft();
        controller.goLeft();
        controller.goLeft();
        controller.goForward();
        controller.pickRock();
        controller.goForward();
        controller.goForward();
        controller.takePhoto(true);
        controller.goRight();
        controller.goRight(); // Max number of commands already reached
        controller.sendToRobot();

        controller.reset();
        controller.goRight();
        controller.goForward();
        controller.goLeft();
        controller.goForward();
        controller.sendToRobot();
        controller.reset();
    }
}
