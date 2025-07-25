public class GoForwardAction extends Action {
    public GoForwardAction() {
        super("Go Forward", 10);
    }

    @Override
    public void execute(Robot robot) {
        System.out.println("Robot goes forward 20 cm.");
        robot.decreaseBattery(getCost());
    }
}