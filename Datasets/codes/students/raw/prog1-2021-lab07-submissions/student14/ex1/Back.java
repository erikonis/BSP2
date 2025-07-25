public class Back extends Action {

    public Back() {
        super();
    }

    @Override
    public void performAction(Robot robot, Maze maze) {
        if (robot.getPosY() - 1 >= 0) {
            if (maze.checkIfValid(robot.getPosX(), robot.getPosY() - 1)) {
                robot.setBatteryLife(robot.getBatteryLife() - 10);
                robot.setPosY(robot.getPosY() - 1);
                System.out.println("Move back by 20 cm");
            } else {
                System.out.println("A wall is blocking the way!");
            }
        } else {
            System.out.println("Can not go back anymore!");
        }
    }
}
