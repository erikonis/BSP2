package SpeedCheckApp;

import java.util.Scanner;

public class SpeedChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter road type ID (1-4): ");
        int roadTypeId = scanner.nextInt();

        System.out.print("Enter driver's speed: ");
        int driverSpeed = scanner.nextInt();

        RoadType road = RoadType.fromId(roadTypeId);

        if (road == null) {
            System.out.println("Unknown road type: " + roadTypeId);
            return;
        }

        int limit = road.getSpeedLimit();
        if (driverSpeed <= limit) {
            System.out.println("Speed OK for " + road.getName() + " road.");
        } else {
            int excess = driverSpeed - limit;
            double excessPercent = (excess * 100.0) / limit;
            int fine = FineCalculator.calculateFine(excessPercent);
            System.out.println("Too fast for " + road.getName() + " road. " + excess + " over the limit!");
            System.out.println("Fine: €" + fine);
        }
    }
}
