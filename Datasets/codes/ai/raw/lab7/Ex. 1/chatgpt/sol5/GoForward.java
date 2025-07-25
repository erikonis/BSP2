public class GoForward extends Action {
    public GoForward() {
        this.timeCost = 10; // 10 seconds
    }

    @Override
    public void execute(Robot robot) {
        robot.moveForward();
        System.out.println("Moved forward 1 tile.");
    }
}
