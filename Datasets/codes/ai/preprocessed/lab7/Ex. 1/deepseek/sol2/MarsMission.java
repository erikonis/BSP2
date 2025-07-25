public class MarsMission {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Controller controller = new Controller(robot);

        // Maze solution
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
        controller.addAction(new MoveRight());
        controller.addAction(new MoveForward());

        System.out.println("Starting Mars Mission...");
        controller.execute();
    }
}