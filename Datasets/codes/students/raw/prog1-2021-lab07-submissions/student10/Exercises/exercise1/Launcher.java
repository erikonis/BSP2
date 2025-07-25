package Exercises.exercise1;

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
        controller.takePhoto("high");
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
