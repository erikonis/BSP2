public class Main{
    public static void main(String[] args){
        //Initialisation
        Robot robot = new Robot();
        Controller controller = new Controller();
        Go moveLeft = new Go("LEFT");
        Go moveDown = new Go("DOWN");
        Go moveRight = new Go("RIGHT");
        TakeHighPhoto photo = new TakeHighPhoto();
        Pickup rockPickup = new Pickup();

        //1st sequence
        controller.add(moveDown);
        controller.add(moveLeft);
        controller.add(moveLeft);
        controller.add(moveLeft);
        controller.add(moveDown);
        controller.add(rockPickup);
        controller.add(moveDown);
        controller.add(moveDown);
        controller.add(photo);
        controller.add(moveRight);
        controller.runActions(robot);
        
        //2nd sequence
        controller.add(moveRight);
        controller.add(moveDown);
        controller.add(moveLeft);
        controller.add(moveDown);
        controller.runActions(robot);
    }
}
