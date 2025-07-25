import java.util.Scanner;

public class SpeedFineIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter road type ID: ");
        int roadType = scanner.nextInt();
        System.out.print("Enter driver's speed: ");
        int speed = scanner.nextInt();

        int speedLimit = 0;
        String roadName = "";

        if (roadType == 1) {
            speedLimit = 130;
            roadName = "motorway";
        } else if (roadType == 2) {
            speedLimit = 90;
            roadName = "ordinary";
        } else if (roadType == 3) {
            speedLimit = 50;
            roadName = "town";
        } else if (roadType == 4) {
            speedLimit = 30;
            roadName = "calmed";
        } else {
            System.out.println("Unknown road type: " + roadType);
            return;
        }

        if (speed > speedLimit) {
            int excess = speed - speedLimit;
            double percentage = (double) excess / speedLimit * 100;
            int fine = 0;

            if (percentage <= 5) {
                fine = 0;
            } else if (percentage <= 30) {
                fine = 50;
            } else if (percentage <= 50) {
                fine = 150;
            } else {
                fine = 500;
            }

            System.out.println("Fine: " + fine + " EUR");
        } else {
            System.out.println("Speed OK for " + roadName + " road.");
        }
    }
}