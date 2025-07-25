public class TakePhoto implements Action {
    private boolean highRes;

    public TakePhoto(boolean highRes) {
        this.highRes = highRes;
    }

    @Override public void execute(Robot robot) {
        if (robot.getX() == 5 && robot.getY() == 5) {
            robot.setAlienPhoto(true);
        }
    }

    @Override public int getCost() { return highRes ? 60 : 40; }
    @Override public String getName() { return highRes ? "HighResPhoto" : "LowResPhoto"; }
}