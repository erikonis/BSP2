

public class MoveForward extends Action {
    public MoveForward() {
        super(10);
    }
    
    @Override
    public void execute(Robot robot) {
        robot.moveForward();
    }
}
