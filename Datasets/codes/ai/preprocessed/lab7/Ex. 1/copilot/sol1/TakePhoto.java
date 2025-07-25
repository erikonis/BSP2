public class TakePhoto extends Action {
    private boolean highResolution;

    public TakePhoto(boolean highResolution) {
        this.highResolution = highResolution;
    }

    @Override
    public void execute(Robot robot) {
        robot.takePhoto(highResolution);
    }

    @Override
    public int getCost() {
        return highResolution ? 60 : 40;
    }
}