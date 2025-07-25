// MoveRight.java
public class MoveRight extends Action {
    @Override
    public void execute(Robot robot) {
        robot.moveRight();
    }

    @Override
    public int getBatteryCost() {
        return 10;
    }
}
