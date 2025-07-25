public class GoForward extends Action {
    public GoForward() {
        timeCost = 10;
    }

    @Override
    public void execute(Robot robot) {
        robot.moveForward();
    }
}
