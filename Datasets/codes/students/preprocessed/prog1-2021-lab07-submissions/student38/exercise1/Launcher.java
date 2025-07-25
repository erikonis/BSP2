public class Launcher {
    
    public static void main(String[] args) {
        
       Controller controller = new Controller(new Robot());

        controller.goDown();
        controller.goLeft();
        controller.goDown();
        controller.goDown();
        controller.goRight();
        controller.goUp();
        controller.takePicture(true);
        controller.pickRock();
        controller.sendToRobot();

        controller.reset();

        controller.goDown();
        controller.goLeft();
        controller.goUp();
        controller.takePicture(false);
        controller.pickRock();
        controller.sendToRobot();

        controller.reset();
        controller.resetBattery();

        controller.goDown();
        controller.goLeft();
        controller.goUp();
        controller.takePicture(false);
        controller.pickRock();
        controller.sendToRobot();

        
    }

}
