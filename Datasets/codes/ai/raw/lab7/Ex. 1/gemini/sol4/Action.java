public abstract class Action {
    private String name;
    private int cost;

    public Action(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public abstract void execute(Robot robot);
}