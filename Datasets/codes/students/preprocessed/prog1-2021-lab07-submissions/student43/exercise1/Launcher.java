public class Launcher {

    public static void main(String[] args) {
        
    Controller controller = new Controller(new Robot());

    controller.MoveDown();
    controller.MoveLeft();
    controller.MoveLeft();
    controller.MoveLeft();
    controller.MoveDown();
    controller.PickRock();
    controller.MoveDown();
    controller.MoveDown();
    controller.PhotoHigh();
    controller.MoveRight();
    // Limit of 10 commands reached.
    controller.MoveRight();
    // Error message printed before commands because controller catches it before commands are sent.
    // Send and reset :
    controller.SendToRobot();
    controller.Reset();
    // More commands : 
    controller.MoveRight();
    controller.MoveDown();
    controller.MoveLeft();
    controller.MoveDown();
    controller.SendToRobot();
    controller.Reset();
    // Maze completed.

    }
    
}
