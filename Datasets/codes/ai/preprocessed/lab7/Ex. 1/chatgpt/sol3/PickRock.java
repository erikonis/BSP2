public class PickRock extends Action {
    public PickRock() {
        timeCost = 150;
    }

    @Override
    public void execute(Robot robot) {
        robot.pickRock();
    }
}