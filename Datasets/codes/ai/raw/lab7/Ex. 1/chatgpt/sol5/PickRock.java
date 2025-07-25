public class PickRock extends Action {
    public PickRock() {
        this.timeCost = 150; // 150 seconds
    }

    @Override
    public void execute(Robot robot) {
        robot.pickRock();
        System.out.println("Picked up a rock.");
    }
}
