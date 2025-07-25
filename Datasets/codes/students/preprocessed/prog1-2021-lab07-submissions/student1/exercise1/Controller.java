public class Controller extends Actions {
    private Robot robot; //takes Robot as an atribute
    private int actionsRemaining = 10; 

    public Controller (Robot robot){ //initializes robot
        this.robot = robot;
    }
    private void batteryLife(){ //reports the remaining battery
        System.out.println("The robot found an exit!");
        System.out.println("-----------------");
        System.out.println("Remaining battery life: "+robot.getBattery() +" seconds");
    }
    @Override
    public void goBack() { 
        if(actionsRemaining>0){
        System.out.println("Move backwards by 20 cm");
        robot.setBattery(robot.getBattery() - 10);
        actionsRemaining--;
        }else{
            batteryLife();
        }
    }
    @Override
    public void goForward() {
        if(actionsRemaining>0){
        System.out.println("Move forward by 20 cm");
        robot.setBattery(robot.getBattery() - 10);
        actionsRemaining--;
        }else{
            batteryLife();
        }
    }
    @Override
    public void goLeft() {
        if(actionsRemaining>0){
        System.out.println("Move left by 20 cm");
        robot.setBattery(robot.getBattery() - 10);
        actionsRemaining--;
        }else{
            batteryLife();
        }
    }
    @Override
    public void goRight() {
        if (actionsRemaining>0){
        System.out.println("Move right by 20 cm");
        robot.setBattery(robot.getBattery() - 10);
        actionsRemaining--;
        }else{
            batteryLife();
        }
    }
    @Override
    public void pickRock() {
        if(actionsRemaining>0){
        System.out.println("The robot found a rock and picked it!");
        robot.setBattery(robot.getBattery() - 150);
        actionsRemaining--;
        }else{
            batteryLife();
        }
    }
    @Override
    public void takePhoto(boolean highResolution) {
        if(highResolution){
                if(actionsRemaining>0){
                System.out.println("Robot took a high-resolution photo");
                robot.setBattery(robot.getBattery() - 60);
                actionsRemaining--;
                }else{
                    batteryLife();
                }
        }else{
            if(actionsRemaining>0){
                System.out.println("Robot took a low-resolution photo");
                robot.setBattery(robot.getBattery() - 40);
                actionsRemaining--;
                }else{
                    batteryLife();
                }
        }
    }
    
    
    
}
