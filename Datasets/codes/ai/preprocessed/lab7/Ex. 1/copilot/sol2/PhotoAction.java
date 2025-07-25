public class PhotoAction extends Action {
    private String resolution;

    public PhotoAction(String resolution) {
        this.resolution = resolution;
        this.batteryCost = resolution.equals("high") ? 60 : 40;
    }

    @Override
    public void execute(Robot robot) {
        robot.takePhoto(resolution);
        robot.decreaseBattery(batteryCost);
        System.out.println("Took " + resolution + " resolution photo. Battery used: " + batteryCost + " seconds.");
    }
}