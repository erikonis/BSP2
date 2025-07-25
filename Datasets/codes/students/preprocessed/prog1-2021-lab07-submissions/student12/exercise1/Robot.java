public class Robot{

    private String name;
    private int batterylife = 3000;
    
    public Robot(String name) {
        this.setName(name);
        this.setBatterylife(batterylife);
    }

    public int getBatterylife() {
        return batterylife;
    }

    public void setBatterylife(int batterylife) {
        this.batterylife = batterylife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
