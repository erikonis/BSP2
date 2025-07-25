package lu.uni.programming1.lab7.exercise1;

import java.util.ArrayList;

public class Controller extends Action{
    private Maze maze;
    private Robot robot;
    private ArrayList<String> commands = new ArrayList<>();

    public Controller(Robot robot) {
        this.robot = robot;
        maze = new Maze();
    }

    public void goLeft() {
        if(commands.size() < 10){
            commands.add("Left");
        }else{
            System.out.println("maximum number of commands reached, cannot accept more");
        }
    }

    public void goRight() {
        if(commands.size() < 10){
            commands.add("Right");
        }else{
            System.out.println("maximum number of commands reached, cannot accept more");
        }
    }

    public void goForward() {
        if(commands.size() < 10){
            commands.add("Forward");
        }else{
            System.out.println("maximum number of commands reached, cannot accept more");
        }
    }

    public void goBack() {
        if(commands.size() < 10){
            commands.add("Back");
        }else{
            System.out.println("maximum number of commands reached, cannot accept more");
        }
    }

    public void pickRock() {
        if(commands.size() < 10){
            commands.add("Rock");
        }else{
            System.out.println("maximum number of commands reached, cannot accept more");
        }
    }

    public void takePhoto(boolean resolution) {
        if(commands.size() < 10){
            if(resolution){
                commands.add("High");
            }else{
                commands.add("Low");
            }
        }else{
            System.out.println("maximum number of commands reached, cannot accept more");
        }
    }

    public void sendToRobot() {
        // New action instance & creation of action array with appropriate size to avoid errors
        Move move = new Move(robot,maze.position,maze.mazeWay);

        // Compares List with commands send from the user with the commands, that the robot can execute.
        for (int i = 0; i < commands.size(); i++) {
            switch(commands.get(i)) {
                case "Left" : move.goLeft(); break;
                case "Right" : move.goRight(); break;
                case "Forward" : move.goForward(); break;
                case "Back" : move.goBack(); break;
                case "High" : move.takePhoto(true); break;
                case "Low" : move.takePhoto(false); break;
                case "Rock" : move.pickRock(); break;
                default : System.out.println("ERROR");
            }
            maze.position = move.getPosition();
        }
        System.out.println("---------------");
        System.out.println("Remaining battery life: " + robot.getBatteryLife() + " seconds");
    }

    // Resets commandList
    public void reset(){
        commands = new ArrayList<String>();
    }
}
