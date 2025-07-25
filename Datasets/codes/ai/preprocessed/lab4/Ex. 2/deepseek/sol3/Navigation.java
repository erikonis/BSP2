public class Navigation {
    // Constants for road types and speed limits
    private static final int[] ROAD_TYPES = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};
    private static final String[] ROAD_NAMES = {"", "motorway", "ordinary", "town", "calmed"};
    private static final int[] SPEED_LIMITS = {0, 130, 90, 50, 30}; // km/h

    public static void main(String[] args) {
        printRouteDescription();
        calculateMinimalDrivingTime();
    }

    private static void printRouteDescription() {
        System.out.println("Route road types:");
        for (int type : ROAD_TYPES) {
            System.out.println(getRoadName(type));
        }
    }

    private static String getRoadName(int type) {
        return (type >= 1 && type <= 4) ? ROAD_NAMES[type] : "unknown";
    }

    private static void calculateMinimalDrivingTime() {
        double totalMinutes = 0;

        for (int type : ROAD_TYPES) {
            totalMinutes += getSegmentTimeMinutes(type);
        }

        System.out.printf("\nMinimal driving time: %.2f minutes\n", totalMinutes);
    }

    private static double getSegmentTimeMinutes(int roadType) {
        if (roadType < 1 || roadType > 4) return 0;
        return 60.0 / SPEED_LIMITS[roadType]; // 1km at speed km/h → 60/speed minutes
    }
}