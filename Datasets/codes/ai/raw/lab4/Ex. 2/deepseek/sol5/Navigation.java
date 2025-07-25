public class Navigation {
    public static void main(String[] args) {
        // 1. Initialize route segments
        int[] route = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};
        
        // 2. Print road type names
        System.out.println("Route road types:");
        for (int segment : route) {
            System.out.println(getRoadName(segment));
        }
        
        // 3. Calculate and print minimal time
        System.out.printf("%nMinimal driving time: %.2f minutes%n", calculateDriveTime(route));
    }
    
    private static String getRoadName(int type) {
        return switch (type) {
            case 1 -> "motorway";
            case 2 -> "ordinary";
            case 3 -> "town";
            case 4 -> "calmed";
            default -> "unknown";
        };
    }
    
    private static double calculateDriveTime(int[] route) {
        double totalMinutes = 0;
        for (int segment : route) {
            totalMinutes += getSegmentTime(segment);
        }
        return totalMinutes;
    }
    
    private static double getSegmentTime(int roadType) {
        return switch (roadType) {
            case 1 -> 60.0/130; // motorway
            case 2 -> 60.0/90;  // ordinary
            case 3 -> 60.0/50;  // town
            case 4 -> 60.0/30;  // calmed
            default -> 0;
        };
    }
}