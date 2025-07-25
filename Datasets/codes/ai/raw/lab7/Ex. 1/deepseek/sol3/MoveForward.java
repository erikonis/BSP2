public class MoveForward implements Action {
    @Override public void execute(Robot robot) { robot.move(0, 1); }
    @Override public int getCost() { return 10; }
    @Override public String getName() { return "Forward"; }
}