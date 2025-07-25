public class MarsMission {
    public static void main(String[] args) {
        Robot marsRobot = new Robot();
        Controller controller = new Controller(marsRobot);

        // Solution to navigate the maze and complete side quests
        controller.addAction(new MoveForward()); // y=1
        controller.addAction(new MoveLeft());    // x=-1
        controller.addAction(new MoveLeft());    // x=-2
        controller.addAction(new MoveLeft());    // x=-3
        controller.addAction(new MoveForward()); // y=2 (rock position)
        controller.addAction(new PickRock());    // Pick rock at (3,2)
        controller.addAction(new MoveForward()); // y=3 (decision point)
        controller.addAction(new MoveForward()); // y=4 (photo sign)
        controller.addAction(new MoveForward()); // y=5 (alien position)
        controller.addAction(new TakePhoto(true)); // Take alien photo
        controller.addAction(new MoveRight());   // x=6
        controller.addAction(new MoveRight());   // x=7
        controller.addAction(new MoveForward()); // y=6 (finish)

        System.out.println("=== Starting Mars Mission ===");
        controller.executeActions();
    }
}