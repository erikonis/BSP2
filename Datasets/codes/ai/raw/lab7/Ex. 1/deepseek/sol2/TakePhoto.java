public class TakePhoto extends Action {
    private final boolean highRes;
    
    public TakePhoto(boolean highRes) {
        super(highRes ? 60 : 40);
        this.highRes = highRes;
    }
    
    @Override
    public void execute(Robot robot) {
        robot.takePhoto(highRes);
    }
    
    @Override
    public String toString() {
        return "Taken " + (highRes ? "High" : "Low") + " Res Photo";
    }
}