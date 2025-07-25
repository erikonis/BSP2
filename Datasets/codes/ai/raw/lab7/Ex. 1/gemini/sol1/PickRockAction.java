// PickRockAction.java
public class PickRockAction extends Action {
    public PickRockAction() {
        super("Pick Up Rock", 150);
    }

    @Override
    public void execute(Robot robot) {
        System.out.println("Robot picks up a rock.");
        robot.decreaseBattery(getCost());
    }
}