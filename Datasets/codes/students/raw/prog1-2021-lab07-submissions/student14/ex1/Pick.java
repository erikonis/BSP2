public class Pick extends Action {

    public Pick() {
        super();
    }

    @Override
    public void performAction(Robot robot, Maze maze) {
        if (maze.checkForRock(robot.getPosX(), robot.getPosY())) {
            robot.setBatteryLife(robot.getBatteryLife() - 150);// lower life up to 150 points
            System.out.println("Picked the rock.");
        } else {
            System.out.println("There is no rock here!");
        }
    }
}
