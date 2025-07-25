import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter road type id: ");
        int typeId = scanner.nextInt();
        System.out.print("Enter traveling speed: ");
        int speed = scanner.nextInt();

        RoadType roadType = RoadType.getById(typeId);
        if (roadType == null) {
            System.out.println("Unknown road type: " + typeId);
        } else {
            checkSpeed(roadType, speed);
        }
    }

    private static void checkSpeed(RoadType roadType, int speed) {
        int speedLimit = roadType.getSpeedLimit();
        if (speed <= speedLimit) {
            System.out.println("Speed OK for " + roadType.getName() + " road.");
        } else {
            int excess = speed - speedLimit;
            System.out.println("Too fast for " + roadType.getName() + " road. " + excess + " over the limit!");
            int fine = calculateFine(excess, speedLimit);
            System.out.println("Fine: " + fine + " Eur");
        }
    }

    private static int calculateFine(int excess, int speedLimit) {
        double excessPercentage = ((double) excess / speedLimit) * 100;
        if (excessPercentage > 5 && excessPercentage <= 30) {
            return 50;
        } else if (excessPercentage > 30 && excessPercentage <= 50) {
            return 150;
        } else if (excessPercentage > 50) {
            return 500;
        }
        return 0;
    }
}
