package lu.uni.programming1.lab7.exercise1;

public class Back5 extends Action {

    public Back5() {
        super.ActionName = "Back";
        super.cost = 10; // Using go actions takes 10second
    }

    public int execute() {
        return cost;
    }

    public String text() {
        return "The robot moved back 20 centimeters . With this move the battery is reduced by: - " + cost + " seconds";
    }
}
