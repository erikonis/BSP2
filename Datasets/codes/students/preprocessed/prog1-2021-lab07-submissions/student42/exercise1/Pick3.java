public class Pick3 extends Action {

    // picking up a rock takes 150 seconds
    public Pick3() {
        ActionName = "Pick a Rock";
        super.cost = 150;
    }

    public int execute() {
        return cost;
    }

    public String text() {
        return "The Rock is picked up. With this move the battery is reduced by: -" + cost + " seconds";
    }
}
