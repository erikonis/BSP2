public abstract class Action {
    protected final int batteryCost;

    public Action(int cost) {
        this.batteryCost = cost;
    }

    public abstract void execute(Robot robot);
    public abstract String toString();

    public int getBatteryCost() {
        return batteryCost;
    }
}