public class Pickup extends Action{

    public Pickup() {
        super(150);
    }

    public void runAction(Robot robot){
        if(isActionPossible(robot)){
            robot.setNumRocks(robot.getNumRocks()+1);
            System.out.println("picking up a rock");
            consumeBattery(robot);
        }
    }    
}
