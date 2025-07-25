public class TakeLowPhoto extends TakePhoto {
    public TakeLowPhoto() {
        super(40);
    }

    public void runAction(Robot robot){
        if(isActionPossible(robot)){
            robot.setNumPhotos(robot.getNumPhotos()+1);
            System.out.println("Taking a low resolution photo");
            consumeBattery(robot);
        }
    }
}
