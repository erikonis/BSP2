public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Robot());
        // attributes, which calls its functions
        controller.goForward();
        controller.goLeft();
        controller.goLeft();
        controller.goLeft();
        controller.goForward();
        controller.pickRock();
        controller.goForward();
        controller.goForward();
        controller.takePhoto(true);// take a picture
        controller.goRight();
        controller.goRight();
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