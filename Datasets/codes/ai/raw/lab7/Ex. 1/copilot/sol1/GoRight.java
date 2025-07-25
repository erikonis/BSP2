

public class GoRight extends Action {
    @Override
    public void execute(Robot robot) {
        robot.moveRight();
    }

    @Override
    public int getCost() {
        return 10;
    }
}
