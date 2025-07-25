package exercise1;

public class robot {

    private int battery, numact;
    
    public robot(int battery) {
        this.battery = battery;
        numact=0;
    }
    public void modBattery(int use) {
        battery = battery-use;}
    public int getBattery(){
        return battery;}
    public void modNumact(){
        numact++;}
    public int getnumact(){
        return numact;
    }

}
