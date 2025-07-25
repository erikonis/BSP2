public class GoLeft extends Action {
    @Override
    public void execute(Robot robot) {
        robot.moveLeft();
    }

    @Override
    public int getCost() {
        return 10;
    }
}