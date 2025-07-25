// TakePhoto.java
public class TakePhoto extends Action {
    private boolean highResolution;

    public TakePhoto(boolean highResolution) {
        this.highResolution = highResolution;
        this.batteryCost = highResolution ? 60 : 40;
    }

    @Override
    public void execute(Robot robot) {
        robot.takePhoto(highResolution);
        robot.consumeBattery(batteryCost);
    }
}