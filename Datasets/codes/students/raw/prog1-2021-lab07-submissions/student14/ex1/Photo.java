public class Photo extends Action {
    private boolean highRes;

    public Photo(boolean highRes) {
        super();
        this.highRes = highRes;
    }

    @Override
    public void performAction(Robot robot, Maze maze) {
        if (highRes) { // true
            robot.setBatteryLife(robot.getBatteryLife() - 60);// lower life up to 60 points
            System.out.println("Took high resolution photo.");
        } else {
            robot.setBatteryLife(robot.getBatteryLife() - 40);// lower life up to 40 points
            System.out.println("Took low resolution photo.");
        }
    }
}
