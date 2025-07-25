package exercise1;

public class Main{
    public static void main(String []args){

        Controller controller = new Controller(new Robot("Mars robot"));

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
        controller.goRight(); // Maximum number of actions reached
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