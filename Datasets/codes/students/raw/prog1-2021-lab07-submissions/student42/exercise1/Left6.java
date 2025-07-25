package lu.uni.programming1.lab7.exercise1;

public class Left6 extends Action {

    public Left6() {
        super.ActionName = "Left";
        super.cost = 10;
    }

    public int execute() {
        return cost;
    }

    public String text() {
        return "The robot moved left 20 centimeters . With this move the battery is reduced by: -" + cost + " seconds";
    }
}
