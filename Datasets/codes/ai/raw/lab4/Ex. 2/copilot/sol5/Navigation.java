public class Navigation {
    public static void main(String[] args) {
        // Static initialization of the array storing road type ids
        int[] roadTypes = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};

        // Output the list of road types in a textual manner
        System.out.println("Road types for the route:");
        for (int roadType : roadTypes) {
            String roadTypeText = switch (roadType) {
                case 1 -> "Motorway";
                case 2 -> "Ordinary road";
                case 3 -> "Town road";
                case 4 -> "Calmed road";
                default -> "Unknown road type";
            };
            System.out.println(roadTypeText);
        }

        // Calculate and output the minimal driving time for the route
        double totalDrivingTimeMinutes = 0;
        for (int roadType : roadTypes) {
            double speedLimit = switch (roadType) {
                case 1 -> 130;
                case 2 -> 90;
                case 3 -> 50;
                case 4 -> 30;
                default -> 0;
            };
            totalDrivingTimeMinutes += (60 / speedLimit); // Driving time in minutes for 1 km
        }

        System.out.printf("Total minimal driving time for the route: %.2f minutes%n", totalDrivingTimeMinutes);
    }
}
