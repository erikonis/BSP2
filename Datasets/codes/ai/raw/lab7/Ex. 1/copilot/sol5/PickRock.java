// PickRock.java
public class PickRock extends Action {
    public PickRock() {
        this.batteryCost = 150;
    }

    @Override
    public void execute(Robot robot) {
        robot.pickRock();
        robot.consumeBattery(batteryCost);
    }
}