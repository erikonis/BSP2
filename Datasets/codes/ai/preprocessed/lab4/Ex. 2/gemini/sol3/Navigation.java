public class Navigation {

    public static void main(String[] args) {
        // Road type IDs for the route
        int[] route = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};

        // Output textual representation of the route
        System.out.println("Navigation Route:");
        for (int segmentType : route) {
            String typeDescription = switch (segmentType) {
                case 1 -> "Motorway";
                case 2 -> "Ordinary Road";
                case 3 -> "Town Road";
                case 4 -> "Calmed Road";
                default -> "Unidentified Road";
            };
            System.out.print(typeDescription + " -> ");
        }
        System.out.println("End of Route");

        // Calculate total travel time in minutes
        double totalTravelTimeMinutes = 0;
        for (int roadCode : route) {
            double speed = switch (roadCode) {
                case 1 -> 130.0;
                case 2 -> 90.0;
                case 3 -> 50.0;
                case 4 -> 30.0;
                default -> 0.0; // Unknown speed
            };
            if (speed > 0) {
                totalTravelTimeMinutes += (1.0 / speed) * 60.0; // Time (hours) * 60 = Time (minutes)
            } else {
                System.out.println("Warning: Speed limit not defined for road type " + roadCode + ".");
            }
        }

        System.out.printf("Estimated minimal travel time: %.2f minutes%n", totalTravelTimeMinutes);
    }
}