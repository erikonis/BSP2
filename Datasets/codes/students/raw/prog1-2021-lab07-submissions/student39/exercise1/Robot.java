package lu.uni.programming1.lab7.exercise1;

public class Robot extends Actions {

    private int x;
    private int y;
    private int batteryLife = 3000;
    private static int advance = 20;
    private String report = "";

    public Robot() {
        this.x = 69;
        this.y = 9;
    }

    //User can place robot anywhere
    public Robot(int x, int y) {
        
        if ( 0 <= x && x <= getMax_x() && 0 <= y && y <= getMax_y()) {
            this.x = x;
            this.y = y;
        } else {
            this.x = 69;
            this.y = 9; 
        }
    }

    public void move(int[] direction, String dir) {

        if (super.collision(direction, x, y, advance)){
            report += "Refused to go " + dir + " to save battery life because there is a wall.\nUsed battery life: 0\n";

        } else if (batteryLife - 10 >= 0) {
            x += advance * direction[0];
            y += advance * direction[1];

            batteryLife -= 10;

            report += "Went " + dir + ".\n";
            report += "Used battery life: 10\n";
        } else {
            report += "No battery life left.\n";
            report += "Used battery life: 0\n";
        }
    }

    public void takeRock() {
        if (super.hasRock(x, y) && batteryLife - 150 >= 0) {
            batteryLife -= 150;
            
            report += "Picked up the rock.\n";
            report += "Used battery life: 150\n";

        } else if (!hasRock(x, y)) {
            report += "Refused to pick up because there is no rock.\n";
            report += "Used battery life: 0\n";
        } else {
            report += "Not enough battery life left.\n";
            report += "Used battery life: 0\n";
        }
    }

    public void takePhoto(boolean highRes) {

        if (highRes && batteryLife - 60 >= 0 ) {
            batteryLife -= 60;

            report += "A high resolution photo was taken.\n";
            report += "Used battery life: 60\n";

            if (atAlien(x, y) == 1) {
                report += "There is an alien on the photo!\n";
            } else if (atAlien(x, y) == 2) {
                report += "Looks like something moved away.\n";
            }

        } else if (!highRes && batteryLife - 40 >= 0) {
            batteryLife -= 40;

            report += "A low resolution photo was taken.\n";
            report += "Used battery life: 40\n";

            if (atAlien(x, y) == 1) {
                report += "There is some green thing on the photo.\n";
            }

        } else {
            report += "Not enough battery life left.\n";
            report += "Used battery life: 0\n";
        }
    }

    public String getReport() {
        // Not usual getter method because new report doesn't contain old one & batterytime should be showed<
        report += "The current battery life is: " + batteryLife + "\n\n";

        String currentReport = report;
        report = "";

        return currentReport;
    }

}
