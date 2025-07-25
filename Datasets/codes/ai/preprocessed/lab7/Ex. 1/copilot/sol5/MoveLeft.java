public class MoveLeft extends Action {
    public MoveLeft() {
        this.batteryCost = 10;
    }

    @Override
    public void execute(Robot robot) {
        robot.moveLeft();
        robot.consumeBattery(batteryCost);
    }
}