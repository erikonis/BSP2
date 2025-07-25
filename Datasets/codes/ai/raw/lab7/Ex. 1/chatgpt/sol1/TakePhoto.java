public class TakePhoto extends Action {
    private boolean highResolution;

    public TakePhoto(boolean highResolution) {
        this.timeCost = highResolution ? 60 : 40;
        this.highResolution = highResolution;
    }

    @Override
    public void execute(Robot robot) {
        robot.takePhoto(highResolution);
    }
}