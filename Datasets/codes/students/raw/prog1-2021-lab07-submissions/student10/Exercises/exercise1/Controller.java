package Exercises.exercise1;

import java.util.ArrayList;

public class Controller extends Action {
    Robot robot;
    ArrayList<String> commands = new ArrayList<>();

    Controller(Robot robot) {

        this.robot = robot;

    }

    public void goLeft() {

        if (commands.size() < 10) {
            robot.batterylife = robot.batterylife - 10;
            commands.add(super.Left());
        }

    }

    public void goBack() {

        if (commands.size() < 10) {
            robot.batterylife = robot.batterylife - 10;
            commands.add(super.Back());
        }

    }

    public void goRight() {

        if (commands.size() < 10) {
            robot.batterylife = robot.batterylife - 10;
            commands.add(super.Right());
        }

    }

    public void goForward() {

        if (commands.size() < 10) {
            robot.batterylife = robot.batterylife - 10;
            commands.add(super.Forward());
        }

    }

    public void takePhoto(String input) {
        if (commands.size() < 10) {
            if (input.equals("high")) {
                robot.batterylife = robot.batterylife - 60;
                commands.add(super.Photo(input));
            } else {
                robot.batterylife = robot.batterylife - 40;
                commands.add(super.Photo(input));
            }
            
        }

    }

    public void pickRock() {
        if (commands.size() < 10) {
            robot.batterylife = robot.batterylife - 150;
            commands.add(super.Rock());
        }

    }

    public void sendToRobot() {
        for (int i = 0; i < commands.size(); i++) {
            robot.addcommand(commands.get(i));
        }
        robot.report();
    }

    public void reset() {
        commands.clear();
    }

}
