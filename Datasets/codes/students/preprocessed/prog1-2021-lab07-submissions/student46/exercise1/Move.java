public class Move extends Action{
    private Robot robot;
    private int position;
    private Character[] mazeWay;

    public Move(Robot robot, int position, Character[] mazeWay) {
        this.robot = robot;
        this.position = position;
        this.mazeWay = mazeWay;
    }

    public void goLeft() {
        if(mazeWay[position].equals('L')){
            position++;
        }
        robot.setBatteryLife(robot.getBatteryLife()-10);
        System.out.println("Move left by 20cm.");
    }

    public void goRight() {
        if(mazeWay[position].equals('R')){
            position++;
        }
        robot.setBatteryLife(robot.getBatteryLife()-10);
        System.out.println("Move right by 20cm.");
    }

    public void goForward() {
        if(mazeWay[position].equals('F')){
            position++;
        }
        robot.setBatteryLife(robot.getBatteryLife()-10);
        System.out.println("Move forward by 20cm.");
    }

    public void goBack() {
        if(mazeWay[position].equals('F')){
            position--;
        }
        robot.setBatteryLife(robot.getBatteryLife()-10);
        System.out.println("Move back by 20cm.");
    }

    // If robot is in pos 5 it picks up the rock else there is no rock to pick up
    public void pickRock() {
        if(position == 5){
            System.out.println("Picked the rock.");
        }else{
            System.out.println("No rock picked.");
        }
        robot.setBatteryLife(robot.getBatteryLife()-150);
    }

    // If robot is in pos 7 it takes a photo, else there is no camera to take a photo
    public void takePhoto(boolean resolution) {
        if(position == 7){
            if(resolution){
                robot.setBatteryLife(robot.getBatteryLife()-60);
                System.out.println("Took high resolution photo.");

            }
            else{
                robot.setBatteryLife(robot.getBatteryLife()-40);
                System.out.println("Took low resolution photo.");
            }
        }else{
            System.out.println("No camera to take photo.");
        }
    }

    public int getPosition(){
        return position;
    }
}
