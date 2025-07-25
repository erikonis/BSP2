public class Right extends Action {

    public Right() {
        super();
    }

    @Override
    public void performAction(Robot robot, Maze maze) {
        if (robot.getPosX() + 1 <= maze.getSize()) {
            if (maze.checkIfValid(robot.getPosX() + 1, robot.getPosY())) {
                robot.setBatteryLife(robot.getBatteryLife() - 10);// lower the life the roboter up to 10 points
                robot.setPosX(robot.getPosX() + 1); // add 1 to position ->position x
                System.out.println("Move right by 20 cm");
            } else {
                System.out.println("A wall is blocking the way!");
            }
        } else {
            System.out.println("Can not go right anymore!");
        }
    }
}
