public class GoRightAction extends Action {
    public GoRightAction() {
        super("Go Right", 10);
    }

    @Override
    public void execute(Robot robot) {
        System.out.println("Robot goes right 20 cm.");
        robot.decreaseBattery(getCost());
    }
}