public class Navigation {

    public static void main(Stringargs) {
        introadTypes = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};

        // Output road types in textual format
        System.out.println("Route Road Types:");
        for (int typeId : roadTypes) {
            String roadType = switch (typeId) {
                case 1 -> "motorway";
                case 2 -> "ordinary";
                case 3 -> "town";
                case 4 -> "calmed";
                default -> "unknown";
            };
            System.out.println(roadType);
        }

        // Calculate minimal driving time
        double totalTime = 0;
        for (int typeId : roadTypes) {
            double speed = switch (typeId) {
                case 1 -> 130.0;
                case 2 -> 90.0;
                case 3 -> 50.0;
                case 4 -> 30.0;
                default -> 0.0; // Handle unknown road type
            };
            totalTime += 1.0 / speed; // Time in hours
        }

        totalTime *= 60; // Convert to minutes
        System.out.println("Minimal driving time: " + totalTime + " minutes");
    }
}