import java.util.Scanner;

public class SpeedLimitCheckWithEnums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read road type ID
        System.out.print("Enter road type ID (1: motorway, 2: ordinary, 3: town, 4: calmed): ");
        int roadTypeId = scanner.nextInt();

        // Read driver's speed
        System.out.print("Enter driver's speed: ");
        int speed = scanner.nextInt();

        // Get road type
        RoadType roadType = RoadType.getById(roadTypeId);
        if (roadType == null) {
            System.out.println("Unknown road type: " + roadTypeId);
            return;
        }

        // Check speed limit
        if (speed <= roadType.getSpeedLimit()) {
            System.out.println("Speed OK for " + roadType.getName() + " road.");
        } else {
            int excess = speed - roadType.getSpeedLimit();
            System.out.println("Too fast for " + roadType.getName() + " road. " + excess + " over the limit!");
        }
    }
}