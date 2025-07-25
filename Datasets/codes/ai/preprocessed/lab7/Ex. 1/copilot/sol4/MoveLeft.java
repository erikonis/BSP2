public class MoveLeft extends Action {
    @Override
    public void execute(Robot robot) {
        robot.moveLeft();
    }

    @Override
    public int getBatteryCost() {
        return 10;
    }
}