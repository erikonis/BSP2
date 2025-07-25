public class MissionMars {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Controller controller = new Controller();

        controller.addAction(new MoveAction("forward"));
        controller.addAction(new MoveAction("left"));
        controller.addAction(new MoveAction("left"));
        controller.addAction(new MoveAction("left"));
        controller.addAction(new MoveAction("forward"));
        controller.addAction(new PickRockAction());
        controller.addAction(new MoveAction("forward"));
        controller.addAction(new MoveAction("forward"));
        controller.addAction(new PhotoAction("high"));
        controller.addAction(new MoveAction("right"));

        controller.executeActions(robot);
    }
}
