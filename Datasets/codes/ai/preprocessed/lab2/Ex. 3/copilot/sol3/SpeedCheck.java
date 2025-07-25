import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Road types and their speed limits
        String[] roadTypes = {"motorway", "ordinary", "town", "calmed"};
        int[] speedLimits = {130, 90, 50, 30};

        // Read input
        System.out.print("Enter road type id: ");
        int typeId = scanner.nextInt();
        System.out.print("Enter traveling speed: ");
        int speed = scanner.nextInt();

        // Check if the road type id is valid
        if (typeId < 1 || typeId > 4) {
            System.out.println("Unknown road type: " + typeId);
            return;
        }

        // Get the road type and speed limit
        String roadType = roadTypes[typeId - 1];
        int speedLimit = speedLimits[typeId - 1];

        // Check if the speed is within the limit
        if (speed <= speedLimit) {
            System.out.println("Speed OK for " + roadType + " road.");
        } else {
            int excess = speed - speedLimit;
            System.out.println("Too fast for " + roadType + " road. " + excess + " over the limit!");

            // Calculate the fine
            double excessPercentage = ((double) excess / speedLimit) * 100;
            int fine = 0;
            if (excessPercentage > 5 && excessPercentage <= 30) {
                fine = 50;
            } else if (excessPercentage > 30 && excessPercentage <= 50) {
                fine = 150;
            } else if (excessPercentage > 50) {
                fine = 500;
            }
            System.out.println("Fine: " + fine + " Eur");
        }
    }
}