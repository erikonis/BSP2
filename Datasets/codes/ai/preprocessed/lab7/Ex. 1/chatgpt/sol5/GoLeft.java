public class GoLeft extends Action {
    public GoLeft() {
        this.timeCost = 10; // 10 seconds
    }

    @Override
    public void execute(Robot robot) {
        robot.moveLeft();
        System.out.println("Moved left 1 tile.");
    }
}