public abstract class Action {
    protected Robot robot;

    public Action(Robot robot) {
        this.robot = robot;
    }

    public abstract void goForward();

    public abstract void goLeft();

    public abstract void goRight();

    public abstract void goBack();

    public abstract void takePicHigh();

    public abstract void takePicLow();

    public abstract void pickRock();

    public abstract void exit();

    public abstract void printAction(String act, int time);

    public abstract void printSet();

}
