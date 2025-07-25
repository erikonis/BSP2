public class TakeHighPhoto extends TakePhoto{
    public TakeHighPhoto() {
        super(60);
    }

    @Override
    public void runAction(Robot robot){
        if(isActionPossible(robot)){
            robot.setNumPhotos(robot.getNumPhotos()+1);
            System.out.println("Taking a high resolution photo");
            consumeBattery(robot);
        }
    }
}
