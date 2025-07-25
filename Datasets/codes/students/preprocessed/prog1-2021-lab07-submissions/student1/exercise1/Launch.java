public class Launch {
    public static void main(String[] args) {
        
        Controller controller = new Controller(new Robot());
       
        controller.goForward();
        controller.goLeft();
        controller.goLeft();
        controller.goLeft();
        controller.pickRock();
        controller.goForward();
        controller.takePhoto(true);
        controller.goRight();
        controller.goRight();
        controller.goForward();
        controller.goLeft(); //more than 10
       
        
    }
}
