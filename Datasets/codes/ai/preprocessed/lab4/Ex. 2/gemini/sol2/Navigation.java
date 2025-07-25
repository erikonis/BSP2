public class Navigation {

    public static void main(String[] args) {
        // 1. Static initialization of the road types array
        int[] routeRoadTypes = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};

        // 2. Output the list of road types in textual manner
        System.out.println("Route Road Types:");
        for (int roadType : routeRoadTypes) {
            String roadTypeText = switch (roadType) {
                case 1 -> "motorway";
                case 2 -> "ordinary";
                case 3 -> "town";
                case 4 -> "calmed";
                default -> "unknown";
            };
            System.out.print(roadTypeText + " -> ");
        }
        System.out.println("Destination"); // Indicate the end of the route

        // 3. Calculate and output the minimal driving time
        double totalTimeInHours = 0;
        for (int roadType : routeRoadTypes) {
            double speedLimit;
            switch (roadType) {
                case 1:
                    speedLimit = 130;
                    break;
                case 2:
                    speedLimit = 90;
                    break;
                case 3:
                    speedLimit = 50;
                    break;
                case 4:
                    speedLimit = 30;
                    break;
                default:
                    speedLimit = 0; // Handle unknown road types
            }
            if (speedLimit > 0) {
                totalTimeInHours += (1.0 / speedLimit); // Time = Distance / Speed (distance is 1 km)
            } else {
                System.out.println("Warning: Unknown road type encountered, time for this segment not calculated.");
            }
        }

        // Convert total time to minutes
        double totalTimeInMinutes = totalTimeInHours * 60;

        System.out.printf("\nMinimal driving time for the route: %.2f minutes%n", totalTimeInMinutes);
    }
}