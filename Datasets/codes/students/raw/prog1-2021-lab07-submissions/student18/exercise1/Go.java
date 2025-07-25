public class Go extends Action {

    private String direction;

    public Go(String direction) {
        super(10);
        this.direction = direction;
    }

    public void runAction(Robot robot){
        if(isActionPossible(robot)){
            switch (direction){
                case "UP":
                    robot.setY(robot.getY()-20);//explanation needed !
                    System.out.println("Moving upwards");
                    consumeBattery(robot);
                    break;
                case "DOWN":
                    robot.setY(robot.getY()+20);
                    System.out.println("Moving downwards");
                    consumeBattery(robot);
                    break;
                case "LEFT":
                    robot.setX(robot.getX()-20);
                    System.out.println("moving to the left");
                    consumeBattery(robot);
                    break;
                case "RIGHT":
                    robot.setX(robot.getX()+20);
                    System.out.println("moving to the right");
                    consumeBattery(robot);
                    break;
                default:
                    System.out.println("This direction was not recognized, check your spelling !");
            }
        }
    }
    
}
