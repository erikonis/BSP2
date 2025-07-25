package lu.uni.programming1.lab7.exercise1;

public class Controller {
    
    private String commands[] = new String[10];
    private Robot robot;

    public Controller(Robot robot) {
        this.robot = robot;
    }

    public void addCommand(String command) {
        boolean done = false;

        for (int i = 0; i < commands.length & !done; i++) {
            if (commands[i] == null) {
                commands[i] = command;
                done = true;
            }
        }
    }

    public String execute() {
        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];

            if(command == null) {
                commands = new String[10];

                return robot.getReport();
            }
            else if (command.equals("left")) {
                robot.move(directionOf("left"), "left");
            }
            else if (command.equals("right")) {
                robot.move(directionOf("right"), "right");
            }
            else if (command.equals("forward")) {
                robot.move(directionOf("forward"), "forward");
            }
            else if (command.equals("back")) {
                robot.move(directionOf("back"), "back");
            }
            else if (command.equals("hi-res photo")) {
                robot.takePhoto(true);
            }
            else if (command.equals("lo-res photo")) {
                robot.takePhoto(false);
            }
            else if (command.equals("take")) {
                robot.takeRock();
            }
        }

        //emties array commands for the next commands
        commands = new String[10];

        return robot.getReport();
        
    }

    private int[] directionOf(String dir) {
        int direction[] = new int[2];
        
        if (dir.equals("left")) {
            direction[0] = -1;
            direction[1] = 0;
        } else if (dir.equals("right")) {
            direction[0] = 1;
            direction[1] = 0;
        } else if (dir.equals("back")) {
            direction[0] = 0;
            direction[1] = -1;
        } else {
            direction[0] = 0;
            direction[1] = 1;
        }

        return direction;
    }

}
