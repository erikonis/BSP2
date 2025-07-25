public class MoveLeft extends MovementAction {
    @Override
    public void execute(RobotState state) {
        state.move(-1, 0);
    }
    
    @Override
    public String getActionName() {
        return "Move Left";
    }
}