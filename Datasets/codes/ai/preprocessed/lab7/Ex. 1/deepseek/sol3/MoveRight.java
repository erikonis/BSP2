public class MoveRight implements Action {
    @Override public void execute(Robot robot) { robot.move(1, 0); }
    @Override public int getCost() { return 10; }
    @Override public String getName() { return "Right"; }
}