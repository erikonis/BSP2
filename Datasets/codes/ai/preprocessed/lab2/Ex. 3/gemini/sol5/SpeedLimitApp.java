import java.util.Scanner;

public class SpeedLimitApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RoadTypeRegistry registry = new RoadTypeRegistry();

        System.out.print("Enter the road type ID (1-4): ");
        int roadTypeId = scanner.nextInt();

        System.out.print("Enter the driver's traveling speed (in km/h): ");
        int driverSpeed = scanner.nextInt();

        RoadType selectedRoadType = registry.getRoadType(roadTypeId);

        if (selectedRoadType == null) {
            System.out.println("Unknown road type: " + roadTypeId);
        } else {
            SpeedChecker.checkSpeed(selectedRoadType, driverSpeed);
        }

        scanner.close();
    }
}