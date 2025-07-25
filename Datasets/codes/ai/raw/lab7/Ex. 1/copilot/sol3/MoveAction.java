public class MoveAction extends Action {
    private String direction;

    public MoveAction(String direction) {
        this.direction = direction;
        this.batteryCost = 10;
    }

    @Override
    public void execute(Robot robot) {
        robot.move(direction);
        robot.decreaseBattery(batteryCost);
        System.out.println("Moved " + direction + ". Battery used: " + batteryCost + " seconds.");
    }
}
