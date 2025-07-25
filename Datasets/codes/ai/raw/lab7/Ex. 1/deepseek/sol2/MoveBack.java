public class MoveBack extends MovementAction {
    @Override
    public void execute(Robot robot) {
        robot.move(0, -1);
    }
    
    @Override
    public String toString() {
        return "Moved Back";
    }
}