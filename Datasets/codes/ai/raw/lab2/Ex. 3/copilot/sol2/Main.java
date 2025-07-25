import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter road type id: ");
        int roadTypeId = scanner.nextInt();
        System.out.print("Enter traveling speed: ");
        int speed = scanner.nextInt();

        String roadType;
        int speedLimit;

        switch (roadTypeId) {
            case 1:
                roadType = "motorway";
                speedLimit = 130;
                break;
            case 2:
                roadType = "ordinary";
                speedLimit = 90;
                break;
            case 3:
                roadType = "town";
                speedLimit = 50;
                break;
            case 4:
                roadType = "calmed";
                speedLimit = 30;
                break;
            default:
                System.out.println("Unknown road type: " + roadTypeId);
                return;
        }

        if (speed <= speedLimit) {
            System.out.println("Speed OK for " + roadType + " road.");
        } else {
            int excess = speed - speedLimit;
            System.out.println("Too fast for " + roadType + " road. " + excess + " over the limit!");

            double excessPercentage = (double) excess / speedLimit * 100;
            int fine;
            if (excessPercentage <= 5) {
                fine = 0;
            } else if (excessPercentage <= 30) {
                fine = 50;
            } else if (excessPercentage <= 50) {
                fine = 150;
            } else {
                fine = 500;
            }
            System.out.println("Fine: " + fine + " EUR");
        }
    }
}