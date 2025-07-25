package lu.uni.programming1.lab7.exercise1;

import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        Action forward = new Action("Forward", 10);
        Action left = new Action("Left", 10);
        Action right = new Action("Right", 10);
        Action backward = new Action("Backward", 10);
        Action lowResolutionPhoto = new Action("Take a low resolution photo", 40);
        Action highResolutionPhoto = new Action("Take a high resolution photo", 60);
        Action rock = new Action("pick up a rock", 150);

        int FullBatteryLife = 3000;
        int toMoveOn = 0;
        int numberOfMoves = 0;
        int numberOfActions = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Actions and their battery consumptions are: ");
            Robot robotToMars = new Robot("K9", FullBatteryLife);
            System.out.println("1: " + forward);

            System.out.println("2: " + left);

            System.out.println("3: " + right);

            System.out.println("4: " + backward);

            System.out.println("5: " + lowResolutionPhoto);

            System.out.println("6: " + highResolutionPhoto);

            System.out.println("7: " + rock);

            System.out.println("================================================");

            System.out.println(robotToMars);

            System.out.println("To what direction " + Robot.nameOfTheRobot + " should move on ?");
            toMoveOn = scanner.nextInt();

            switch (toMoveOn) {
            case 1:
                System.out.println("\n" + Robot.nameOfTheRobot + " moved forward and lost 10 Battery life\n");
                FullBatteryLife = FullBatteryLife - 10;
                numberOfMoves++;
                break;
            case 2:
                System.out.println("\n" + Robot.nameOfTheRobot + " moved to the left and lost 10 Battery life\n");
                FullBatteryLife = FullBatteryLife - 10;
                numberOfMoves++;
                break;
            case 3:
                System.out.println("\n" + Robot.nameOfTheRobot + " moved to the right and lost 10 Battery life\n");
                FullBatteryLife = FullBatteryLife - 10;
                numberOfMoves++;
                break;
            case 4:
                System.out.println("\n" + Robot.nameOfTheRobot + " moved backward and lost 10 Battery life\n");
                FullBatteryLife = FullBatteryLife - 10;
                numberOfMoves++;
                break;
            case 5:
                System.out.println("\n" + Robot.nameOfTheRobot
                        + " took a low resolution photo fo the alien and lost 40 Battery life\n");
                FullBatteryLife = FullBatteryLife - 40;
                numberOfActions++;
                numberOfMoves++;
                break;
            case 6:
                System.out.println("\n" + Robot.nameOfTheRobot
                        + " took a high resolution photo of the alien and lost 60 Battery life\n");
                FullBatteryLife = FullBatteryLife - 60;
                numberOfActions++;
                numberOfMoves++;
                break;
            case 7:
                System.out.println("\n" + Robot.nameOfTheRobot + " lift it up the rock and lost 150 Battery life\n");
                FullBatteryLife = FullBatteryLife - 150;
                numberOfActions++;
                numberOfMoves++;
                break;
            }
        } while (FullBatteryLife > 0 && numberOfMoves < 10);

        if (FullBatteryLife == 0) {
            System.out.println(Robot.nameOfTheRobot + " doesn't have any battery left !! GaveOver!!\n");
            System.out.println(
                    Robot.nameOfTheRobot + " had : " + numberOfMoves + " moves and " + numberOfActions + " actions\n");

        } else {
            System.out.println(
                    Robot.nameOfTheRobot + "  is out of moves remaining battery life: " + FullBatteryLife + " \n");
            System.out.println(Robot.nameOfTheRobot + "  had : " + numberOfMoves + " moves and " + numberOfActions
                    + " actions \n");
        }

        scanner.close();
    }

}
