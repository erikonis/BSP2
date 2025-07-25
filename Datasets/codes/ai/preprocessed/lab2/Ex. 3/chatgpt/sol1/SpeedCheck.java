import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter road type id: ");
        int roadTypeId = scanner.nextInt();
        System.out.print("Enter traveling speed: ");
        int speed = scanner.nextInt();

        RoadType roadType = RoadType.getById(roadTypeId);
        if (roadType == null) {
            System.out.println("Unknown road type: " + roadTypeId);
        } else {
            int speedLimit = roadType.getSpeedLimit();
            if (speed > speedLimit) {
                int excess = speed - speedLimit;
                System.out.println("Too fast for " + roadType.getName() + " road. " + excess + " over the limit!");
                System.out.println("Fine: " + calculateFine(speedLimit, excess) + " EUR");
            } else {
                System.out.println("Speed OK for " + roadType.getName() + " road.");
            }
        }

        scanner.close();
    }

    private static int calculateFine(int speedLimit, int excess) {
        double excessPercentage = (excess / (double) speedLimit) * 100;
        if (excessPercentage > 50) return 500;
        if (excessPercentage > 30) return 150;
        if (excessPercentage > 5) return 50;
        return 0;
    }
}