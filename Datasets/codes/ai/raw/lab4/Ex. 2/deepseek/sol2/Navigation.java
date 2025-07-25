public class Navigation {
    public static void main(String[] args) {
        // 1. Static initialization of road types array
        int[] roadTypes = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};
        
        // 2. Output road types in textual format
        System.out.println("Route road types:");
        for (int type : roadTypes) {
            String roadName = switch (type) {
                case 1 -> "motorway";
                case 2 -> "ordinary";
                case 3 -> "town";
                case 4 -> "calmed";
                default -> "unknown";
            };
            System.out.println(roadName);
        }
        
        // 3. Calculate minimal driving time
        double totalHours = 0.0;
        for (int type : roadTypes) {
            int speedLimit = switch (type) {
                case 1 -> 130;
                case 2 -> 90;
                case 3 -> 50;
                case 4 -> 30;
                default -> 0;
            };
            totalHours += 1.0 / speedLimit; // Time = Distance/Speed (1km per segment)
        }
        
        // Convert hours to minutes
        double totalMinutes = totalHours * 60;
        System.out.printf("\nMinimal driving time: %.2f minutes\n", totalMinutes);
    }
}