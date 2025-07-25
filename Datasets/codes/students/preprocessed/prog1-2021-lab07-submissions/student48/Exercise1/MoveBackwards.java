public class MoveBackwards extends Action {

    @Override
    void doAction() {
        cost = 10;
        action = "You went backwards";
        leftoverBattery = leftoverBattery - cost;
        System.out.println(action + " and you have taken " + cost + " seconds.");
    }

    public MoveBackwards() {
    }

}
