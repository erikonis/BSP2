public class MoveLeft extends Action {

    @Override
    void doAction() {
        cost = 10;
        action = "You went left";
        leftoverBattery = leftoverBattery - cost;
        System.out.println(action + " and you have taken " + cost + " seconds.");
    }

    public MoveLeft() {
    }

}
