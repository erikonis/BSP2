public abstract class Action {
    protected int batteryCost;

    public abstract void execute(Robot robot);

    public int getBatteryCost() {
        return batteryCost;
    }
}