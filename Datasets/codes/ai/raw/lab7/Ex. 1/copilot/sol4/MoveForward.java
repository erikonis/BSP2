// MoveForward.java
public class MoveForward extends Action {
    @Override
    public void execute(Robot robot) {
        robot.moveForward();
    }

    @Override
    public int getBatteryCost() {
        return 10;
    }
}
