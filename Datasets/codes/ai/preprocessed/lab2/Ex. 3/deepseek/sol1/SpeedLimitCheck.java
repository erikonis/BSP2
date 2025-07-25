import java.util.Scanner;

public class SpeedLimitCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read road type ID
        System.out.print("Enter road type ID (1: motorway, 2: ordinary, 3: town, 4: calmed): ");
        int roadTypeId = scanner.nextInt();

        // Read driver's speed
        System.out.print("Enter driver's speed: ");
        int speed = scanner.nextInt();

        // Define speed limits
        int speedLimit = 0;
        String roadType = "";

        switch (roadTypeId) {
            case 1:
                speedLimit = 130;
                roadType = "motorway";
                break;
            case 2:
                speedLimit = 90;
                roadType = "ordinary";
                break;
            case 3:
                speedLimit = 50;
                roadType = "town";
                break;
            case 4:
                speedLimit = 30;
                roadType = "calmed";
                break;
            default:
                System.out.println("Unknown road type: " + roadTypeId);
                return;
        }

        // Check speed limit
        if (speed <= speedLimit) {
            System.out.println("Speed OK for " + roadType + " road.");
        } else {
            int excess = speed - speedLimit;
            System.out.println("Too fast for " + roadType + " road. " + excess + " over the limit!");
        }
    }
}