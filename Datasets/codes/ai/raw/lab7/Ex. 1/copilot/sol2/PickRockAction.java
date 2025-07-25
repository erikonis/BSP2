public class PickRockAction extends Action {
    public PickRockAction() {
        this.batteryCost = 150;
    }

    @Override
    public void execute(Robot robot) {
        robot.pickRock();
        robot.decreaseBattery(batteryCost);
        System.out.println("Picked a rock. Battery used: " + batteryCost + " seconds.");
    }
}
