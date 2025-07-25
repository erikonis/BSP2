public class PickRock implements Action {
    @Override public void execute(Robot robot) {
        if (robot.getX() == 3 && robot.getY() == 2) {
            robot.setRock(true);
        }
    }
    
    @Override public int getCost() { return 150; }
    @Override public String getName() { return "PickRock"; }
}