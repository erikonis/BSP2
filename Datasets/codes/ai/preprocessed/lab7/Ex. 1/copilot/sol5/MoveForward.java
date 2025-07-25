public class MoveForward extends Action {
    public MoveForward() {
        this.batteryCost = 10;
    }

    @Override
    public void execute(Robot robot) {
        robot.moveForward();
        robot.consumeBattery(batteryCost);
    }
}