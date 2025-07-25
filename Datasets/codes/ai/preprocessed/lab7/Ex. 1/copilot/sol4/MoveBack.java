public class MoveBack extends Action {
    @Override
    public void execute(Robot robot) {
        robot.moveBack();
    }

    @Override
    public int getBatteryCost() {
        return 10;
    }
}