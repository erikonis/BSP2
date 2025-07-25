public class Robot {
    private String name;
    private int totalBattery;
    private int remainingBattery;
    // attributes de la classe = name, totalBettery et remainingBattery

    public Robot(String robotName, int totalBattery) {
        // attributes de l methode robot = robotName and totalBattery
        this.name = robotName;
        this.totalBattery = totalBattery;
        this.remainingBattery = totalBattery;
    }

    public String getName() {
        return name;
    }

    public int getTotalBattery() {
        return totalBattery;
    }

    public int getRemainingBattery() {
        return remainingBattery;
    }

    public void setRemainingBattery(int remainingBattery) {
        this.remainingBattery = remainingBattery;
    }

    public void doAction(Action action) {
       this.remainingBattery -= action.getTime();
    }


    @Override
    public String toString() {
        return this.name +  "(" + this.remainingBattery + "sec/" + totalBattery + "sec)";
        // this represent this class where we are
        // this.getName va appeler la methode getName different de this.name
    }
}
 