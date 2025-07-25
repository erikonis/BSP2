// MissionMars.java
public class MissionMars {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Controller controller = new Controller();

        // Define the sequence of actions
        controller.addAction(new MoveForward());
        controller.addAction(new MoveLeft());
        controller.addAction(new MoveLeft());
        controller.addAction(new MoveLeft());
        controller.addAction(new MoveForward());
        controller.addAction(new PickRock());
        controller.addAction(new MoveForward());
        controller.addAction(new MoveForward());
        controller.addAction(new TakePhoto(true));
        controller.addAction(new MoveRight());

        // Execute the actions
        controller.executeActions(robot);
    }
}
