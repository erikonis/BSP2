public abstract class Action {
    protected int timeCost;

    public int getTimeCost() {
        return timeCost;
    }

    public abstract void execute(Robot robot);
}