public class TakePhoto extends Action {
    private boolean highResolution;

    public TakePhoto(boolean highResolution) {
        this.timeCost = highResolution ? 60 : 40; // 60 for high res, 40 for low res
        this.highResolution = highResolution;
    }

    @Override
    public void execute(Robot robot) {
        robot.takePhoto(highResolution);
        System.out.println("Took a " + (highResolution ? "high" : "low") + " resolution photo.");
    }
}