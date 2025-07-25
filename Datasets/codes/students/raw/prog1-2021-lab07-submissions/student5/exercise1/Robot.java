package lu.uni.programming1.lab7.exercise1;

public class Robot {
    static String nameOfTheRobot = "";
    private int totalBattery;
    private int remainingBattery;

    public Robot(String nameOfTheRobot, int remainingBattery) {
        Robot.nameOfTheRobot = nameOfTheRobot;
        this.remainingBattery = remainingBattery;
    }

    public String getNameOfTheRobot() {
        return nameOfTheRobot;
    }

    public void setNameOfTheRobot(String nameOfTheRobot) {
        Robot.nameOfTheRobot = nameOfTheRobot;
    }

    public int getTotalBattery() {
        return totalBattery;
    }

    public void setTotalBattery(int totalBattery) {
        this.totalBattery = totalBattery;
    }

    @Override
    public String toString() {
        return nameOfTheRobot + " is on Mars for an exploration ! \n" + nameOfTheRobot + "'s" + " Battery life: "
                + remainingBattery;
    }

}
