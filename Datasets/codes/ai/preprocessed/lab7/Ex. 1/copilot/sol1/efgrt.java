public class MissionMars {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Controller controller = new Controller();

        controller.addAction(new GoForward());
        controller.addAction(new GoLeft());
        controller.addAction(new GoLeft());
        controller.addAction(new GoLeft());
        controller.addAction(new GoForward());
        controller.addAction(new PickRock());
        controller.addAction(new GoForward());
        controller.addAction(new TakePhoto(true));
        controller.addAction(new GoRight());
        controller.addAction(new GoRight());

        controller.executeActions(robot);
    }
}