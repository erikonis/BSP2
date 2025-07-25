public abstract class Action {

    private int battery = 3000;

    public int getBattery() {
        return battery;
    }


    public void setBattery(int battery) {
        this.battery = battery;
    }



    public abstract void show();
}
