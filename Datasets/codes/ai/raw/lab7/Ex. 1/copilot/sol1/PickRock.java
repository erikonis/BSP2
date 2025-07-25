

public class PickRock extends Action {
    @Override
    public void execute(Robot robot) {
        robot.pickRock();
    }

    @Override
    public int getCost() {
        return 150;
    }
}
