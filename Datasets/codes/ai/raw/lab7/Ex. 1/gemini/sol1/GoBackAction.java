// GoBackAction.java
public class GoBackAction extends Action {
    public GoBackAction() {
        super("Go Back", 10);
    }

    @Override
    public void execute(Robot robot) {
        System.out.println("Robot goes back 20 cm.");
        robot.decreaseBattery(getCost());
    }
}