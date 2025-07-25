package lu.uni.programming1.lab7.Exercise1;

public abstract class Action {

    public int cost;
    public int leftoverBattery = 3000;

    public String action;

    abstract void doAction();

    public Action() {
    }

    




}
