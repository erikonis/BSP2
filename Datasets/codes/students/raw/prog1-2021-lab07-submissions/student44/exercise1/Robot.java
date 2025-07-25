package lu.uni.programming1.lab7.exercise1;

public class Robot {

    private int battery;
    Actions action;

    public Robot(int battery) {
        this.battery = battery;
    }

    public void getBatteryCost(Actions action) {
        System.out.println("Battery cost : " + action.getBatteryCost());
    }

    public void minusBatteryLife(Actions action) {
        this.battery -= action.getBatteryCost();
    }

    public void getTheRestoftheBattery(Actions action) {
        System.out.println("Battery left : " + this.battery + " sec.");
    }

    public String doAction(Actions action) {
        System.out.println(action.getAction());
        return action.getAction();
    }

}