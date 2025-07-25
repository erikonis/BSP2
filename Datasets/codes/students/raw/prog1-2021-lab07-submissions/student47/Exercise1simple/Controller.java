package Exercise1simple;

public class Controller extends Action {

    public Controller(Robot robot) {
        super(robot);
    }

    public void goForward() {
        robot.bLife -= 10;
        robot.posx++;
        robot.actions++;
        printAction("Moving forward", 10);
    }

    public void goLeft() {
        robot.bLife -= 10;
        robot.posy--;
        robot.actions++;
        printAction("Moving left", 10);
    }

    public void goRight() {
        robot.bLife -= 10;
        robot.posy++;
        robot.actions++;
        printAction("Moving right", 10);
    }

    public void goBack() {
        robot.bLife -= 10;
        robot.posx--;
        robot.actions++;
        printAction("Moving back", 10);
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

    public void pickRock() {
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
