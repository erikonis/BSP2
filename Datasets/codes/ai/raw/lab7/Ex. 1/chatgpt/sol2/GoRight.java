public class GoRight extends Action {
    public GoRight() {
        timeCost = 10;
    }

    @Override
    public void execute(Robot robot) {
        robot.moveRight();
    }
}