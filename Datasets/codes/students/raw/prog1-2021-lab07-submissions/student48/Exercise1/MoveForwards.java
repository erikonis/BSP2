package lu.uni.programming1.lab7.Exercise1;

public class MoveForwards extends Action {
    
    @Override
    void doAction() {
        cost = 10;
        action = "You went forwards";
        leftoverBattery = leftoverBattery - cost;
        System.out.println(action + " and you have taken " + cost + " seconds.");
    }

    public MoveForwards() {
    }
    
}
