public class TakePhotoAction extends Action {
    private boolean highResolution;

    public TakePhotoAction(boolean highResolution) {
        super(highResolution ? "Take High-Resolution Photo" : "Take Low-Resolution Photo", highResolution ? 60 : 40);
        this.highResolution = highResolution;
    }

    @Override
    public void execute(Robot robot) {
        System.out.println("Robot takes a " + (highResolution ? "high" : "low") + "-resolution photo.");
        robot.decreaseBattery(getCost());
    }
}