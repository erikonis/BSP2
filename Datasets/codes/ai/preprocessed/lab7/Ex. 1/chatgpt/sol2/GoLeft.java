public class GoLeft extends Action {
    public GoLeft() {
        timeCost = 10;
    }

    @Override
    public void execute(Robot robot) {
        robot.moveLeft();
    }
}