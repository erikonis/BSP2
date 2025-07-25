public class Forward1 extends Action {

    public Forward1() {
        super.ActionName = "Forward";
        super.cost = 10;
    }

    public int execute() {
        return cost;
    }

    public String text() {
        return "The robot moved forward 20 centimeters . With this move the battery is reduced by: -" + cost + " seconds";
    }
}
