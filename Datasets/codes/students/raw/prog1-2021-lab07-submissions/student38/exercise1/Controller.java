package lu.uni.programming1.lab7.exercise1;

public class Controller {

    Robot robot;
    int counter = 0;
    Action actions[] = new Action[10];

    public Controller(Robot robot) {
        this.robot = robot;
    }

    public void move(String direction) {
        if (checkCapacity()) {
            robot.setCapacity(robot.getCapacity() - 20);
            actions[counter++] = new ActionMove(direction);
        } 
    }

    public void goRight() {
        move("right");
    }

    public void goLeft() {
        move("left");
    }

    public void goUp() {
        move("up");
    }

    public void goDown() {
        move("down");
    }

    public void takePicture(boolean highRes) {
        if (checkCapacity()) {
            if (highRes) {
                robot.setCapacity(robot.getCapacity() - 60);
                actions[counter++] = new ActionPicture(true);
            } else {
                robot.setCapacity(robot.getCapacity() - 40);
                actions[counter++] = new ActionPicture(false);
            }
        }
        
    }

    public void pickRock() {
        if (checkCapacity()) {
            robot.setCapacity(robot.getCapacity() - 150);
            actions[counter++] = new ActionRock();

        }
        
    }

    public boolean checkCapacity() {
        if (counter<10) {
            return true;
        } else {
            System.out.println("No more action possible");
            return false;
        }
    }


    

    public void sendToRobot() {
        for (int i = 0; i < counter; i++) {
            actions[i].execute();
        }
        System.out.println("Remaining battery life: " + robot.getCapacity() + " seconds");
    }

    public void reset() {
        for (int i = 0; i < counter; i++) {
            actions[i] = null;
        }
        counter = 0;
    }

    public void resetBattery() {
        robot.setCapacity(3000);
    }

}