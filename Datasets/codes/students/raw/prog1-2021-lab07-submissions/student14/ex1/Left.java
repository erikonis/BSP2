public class Left extends Action {

    public Left() {
        super();
    }

    @Override
    public void performAction(Robot robot, Maze maze) {
        if (robot.getPosX() - 1 >= 0) {
            if (maze.checkIfValid(robot.getPosX() - 1, robot.getPosY())) { //check if the roboter is not moving into a wall
                robot.setBatteryLife(robot.getBatteryLife() - 10);
                robot.setPosX(robot.getPosX() - 1);
                System.out.println("Move left by 20 cm");
            } else {
                System.out.println("A wall is blocking the way!");
            }
        } else {
            System.out.println("Can not go left anymore!");
        }
    }
}
