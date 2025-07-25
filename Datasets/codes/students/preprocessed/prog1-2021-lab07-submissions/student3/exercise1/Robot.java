public class Robot {
    private String name="";
    private int totalBattery;
    private int remainingBattery;

    public Robot(String robotname, int totalBattery) {
        this.name = robotname;
        this.totalBattery = totalBattery;
        this.remainingBattery = totalBattery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalBattery() {
        return totalBattery;
    }

    public void setTotalBattery(int totalBattery) {
        this.totalBattery = totalBattery;
    }

    public int getRemainingBattery() {
        return remainingBattery;
    }

    public void setRemainingBattery(int remainingBattery) {
        this.remainingBattery = remainingBattery;
    }

    @Override
    public String toString() {
        return "Robot: " + name + ", is ready to explore!\nBattery life: "+remainingBattery;
    }

}
