public class Right2 extends Action {

    public Right2() {
        super.ActionName = "Right";
        super.cost = 10;
    }

    public int execute() {
        return cost;
    }

    public String text() {
        return "The robot moved forward 20 centimeters . With this move the battery is reduced by: -" + cost + " seconds";
    }
}
