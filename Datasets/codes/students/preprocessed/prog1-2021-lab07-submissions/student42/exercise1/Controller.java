public class Controller {

    public static void main(String[] args) {

        Robot robot = new Robot();
        Action forward = new Forward1();
        Action back = new Back5();
        Action right = new Right2();
        Action left = new Left6();
        Action pick = new Pick3();
        Action hrp = new Photo4(true);
        Action lhp = new Photo4(false);

        // Action commands to the robot to be executed in Maze
        Action[] set = new Action[] { forward, left, left, left, forward, pick, forward, forward, hrp, right };
        Action[] set2 = new Action[] {};
        Action[] set3 = new Action[] { forward, left, left, left, forward, pick, forward, forward, hrp, back, lhp };

        robot.move(set);
        robot.reset();
        robot.move(set2);
        robot.reset();
        robot.move(set3);
    }
}
