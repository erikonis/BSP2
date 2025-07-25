public class Forward extends Action {

    public Forward() {
        super();
    }

    @Override
    public void performAction(Robot robot, Maze maze) {
        if (robot.getPosY() + 1 <= maze.getSize()) {
            if (maze.checkIfValid(robot.getPosX(), robot.getPosY() + 1)) {
                robot.setBatteryLife(robot.getBatteryLife() - 10); // lower the life from the robot up to 10
                robot.setPosY(robot.getPosY() + 1); // add a position field -> position:y
                System.out.println("Move forward by 20 cm");// ouput
            } else {
                System.out.println("A wall is blocking the way!");// obstacle
            }
        } else {
            System.out.println("Can not go forward anymore!");
        }
    }
}
