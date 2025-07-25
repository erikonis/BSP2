public class GoLeftAction extends Action {
    public GoLeftAction() {
        super("Go Left", 10);
    }

    @Override
    public void execute(Robot robot) {
        System.out.println("Robot goes left 20 cm.");
        robot.decreaseBattery(getCost());
    }
}