public abstract class Action {
    protected final int batteryCost;

    protected Action(int batteryCost) {
        this.batteryCost = batteryCost;
    }

    public abstract void execute(Robot robot);

    public int getBatteryCost() {
        return batteryCost;
    }

    public abstract String getDescription();
}