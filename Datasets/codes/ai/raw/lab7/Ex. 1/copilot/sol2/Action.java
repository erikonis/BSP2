public abstract class Action {
    protected int batteryCost;

    public int getBatteryCost() {
        return batteryCost;
    }

    public abstract void execute(Robot robot);
}
