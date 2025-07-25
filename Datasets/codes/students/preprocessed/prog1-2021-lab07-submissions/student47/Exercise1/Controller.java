public class Controller extends Action {

    public Controller(Robot robot) {
        super(robot);
    }

    public void goForward() {
        if (!robot.getPos().isD())
            System.out.println("Action impossible!");
        else {
            robot.bLife -= 10;
            robot.actions++;
            printAction("Moving forward", 10);
            robot.maze.setC(robot.getPosx() + 1, robot.getPosy(), 1);
            robot.maze.setC(robot.getPosx(), robot.getPosy(), 0);
            robot.setPos(robot.maze.getPos(robot.getPosx() + 1, robot.getPosy()));
        }

    }

    public void goLeft() {
        if (!robot.getPos().isL())
            System.out.println("Action impossible!");
        else {
            robot.bLife -= 10;
            robot.actions++;
            printAction("Moving left", 10);
            robot.maze.setC(robot.getPosx(), robot.getPosy() - 1, 1);
            robot.maze.setC(robot.getPosx(), robot.getPosy(), 0);
            robot.setPos(robot.maze.getPos(robot.getPosx(), robot.getPosy() - 1));
        }

    }

    public void goRight() {
        if (!robot.getPos().isR())
            System.out.println("Action impossible!");
        else {
            robot.bLife -= 10;
            robot.actions++;
            printAction("Moving right", 10);
            robot.maze.setC(robot.getPosx(), robot.getPosy() + 1, 1);
            robot.maze.setC(robot.getPosx(), robot.getPosy(), 0);
            robot.setPos(robot.maze.getPos(robot.getPosx(), robot.getPosy() + 1));
        }
    }

    public void goBack() {
        if (!robot.getPos().isU())
            System.out.println("Action impossible!");
        else {
            robot.bLife -= 10;
            robot.actions++;
            printAction("Moving back", 10);
            robot.maze.setC(robot.getPosx() - 1, robot.getPosy(), 1);
            robot.maze.setC(robot.getPosx(), robot.getPosy(), 0);
            robot.setPos(robot.maze.getPos(robot.getPosx() - 1, robot.getPosy()));
        }

    }

    public void takePicHigh() {
        printAction("Taking high resolution picture", 60);
        robot.bLife -= 60;
        robot.actions++;
    }

    public void takePicLow() {
        printAction("Taking low resolution picture", 40);
        robot.bLife -= 40;
        robot.actions++;
    }

    public void pickRock()

    {
        printAction("Picking up rock", 150);

        robot.bLife -= 150;
        robot.actions++;

    }

    public void exit() {
        System.out.println("\n ***** In total " + robot.actions + " actions were performed, remaining battery time:"
                + robot.bLife + "s ***** \n");
        System.out.println("Exit found! To Mars we shall go!!");

    }

    public void printAction(String act, int time) {
        System.out.println("\n *** " + act + " action executed; battery time used:" + time + "s *** \n");
    }

    public void printSet() {
        int act = robot.actions;
        while (act > 10)
            act -= 10;

        System.out.println(
                "\n **** " + act + " actions were performed, remaining battery time:" + robot.bLife + "s **** \n");
    }

}
