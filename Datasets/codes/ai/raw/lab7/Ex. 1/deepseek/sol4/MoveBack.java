public class MoveBack extends MovementAction {
    @Override
    public void execute(RobotState state) {
        state.move(0, -1);
    }
    
    @Override
    public String getActionName() {
        return "Move Back";
    }
}