public class Navigation {
    public static void main(String[] args) {
        // 1. Static array initialization
        int[] roadTypes = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};

        // 2. Mapping road types to textual descriptions and printing them
        System.out.println("Route description:");
        for (int type : roadTypes) {
            String roadDescription = switch (type) {
                case 1 -> "motorway";
                case 2 -> "ordinary";
                case 3 -> "town";
                case 4 -> "calmed";
                default -> "unknown";
            };
            System.out.println("- " + roadDescription);
        }

        // 3. Calculate minimal driving time per segment (in minutes)
        double totalTimeMinutes = 0.0;

        for (int type : roadTypes) {
            int speedLimit = switch (type) {
                case 1 -> 130;
                case 2 -> 90;
                case 3 -> 50;
                case 4 -> 30;
                default -> 1; // to avoid division by 0
            };

            double timeForSegment = 60.0 / speedLimit; // 1 km per segment, convert from hours to minutes
            totalTimeMinutes += timeForSegment;
        }

        // Output the total minimal time
        System.out.printf("Estimated minimal driving time: %.2f minutes%n", totalTimeMinutes);
    }
}
