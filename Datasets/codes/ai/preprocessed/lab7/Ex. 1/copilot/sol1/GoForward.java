public class GoForward extends Action {
    @Override
    public void execute(Robot robot) {
        robot.moveForward();
    }

    @Override
    public int getCost() {
        return 10;
    }
}