public class Navigation {

    public static void main(String[] args) {
        // Define the route's road segment types
        int[] routeSegments = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};

        // Display the route with textual descriptions
        System.out.println("Your Navigation Route:");
        for (int segmentCode : routeSegments) {
            String segmentDescription = switch (segmentCode) {
                case 1 -> "Highway";
                case 2 -> "Country Road";
                case 3 -> "City Street";
                case 4 -> "Residential Road";
                default -> "Unknown Road Type";
            };
            System.out.print(segmentDescription + " -> ");
        }
        System.out.println("Destination Reached");

        // Calculate the total estimated travel duration in minutes
        double totalDuration = 0;
        for (int roadTypeIdentifier : routeSegments) {
            double speedKmh = switch (roadTypeIdentifier) {
                case 1 -> 130.0;
                case 2 -> 90.0;
                case 3 -> 50.0;
                case 4 -> 30.0;
                default -> 0.0; // Speed not found
            };
            if (speedKmh > 0) {
                totalDuration += (1.0 / speedKmh) * 60.0; // Convert hours to minutes
            } else {
                System.out.println("Alert: Speed limit unavailable for road type ID " + roadTypeIdentifier + ".");
            }
        }

        System.out.printf("Estimated travel duration: %.2f minutes%n", totalDuration);
    }
}