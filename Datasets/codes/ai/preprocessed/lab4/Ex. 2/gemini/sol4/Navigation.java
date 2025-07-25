public class Navigation {

    public static void main(String[] args) {
        // Define the sequence of road types for the journey
        int[] roadSequence = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};

        // Display the route in a user-friendly format
        System.out.println("Proposed Route:");
        for (int roadId : roadSequence) {
            String roadName = switch (roadId) {
                case 1 -> "Motorway";
                case 2 -> "Main Road";
                case 3 -> "Town Street";
                case 4 -> "Calmed Street";
                default -> "Unknown Road";
            };
            System.out.print(roadName + " -> ");
        }
        System.out.println("Arrival");

        // Calculate the minimum travel duration in minutes
        double totalDurationMinutes = 0;
        for (int typeCode : roadSequence) {
            double speedLimitKmph = switch (typeCode) {
                case 1 -> 130.0;
                case 2 -> 90.0;
                case 3 -> 50.0;
                case 4 -> 30.0;
                default -> 0.0; // Indicate no speed defined
            };
            if (speedLimitKmph > 0) {
                totalDurationMinutes += (1.0 / speedLimitKmph) * 60.0; // Convert hours to minutes
            } else {
                System.out.println("Warning: No speed limit specified for road type ID " + typeCode + ".");
            }
        }

        System.out.printf("Estimated travel time: %.2f minutes%n", totalDurationMinutes);
    }
}