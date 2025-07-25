

public class GoBack extends Action {
    @Override
    public void execute(Robot robot) {
        robot.moveBack();
    }

    @Override
    public int getCost() {
        return 10;
    }
}
