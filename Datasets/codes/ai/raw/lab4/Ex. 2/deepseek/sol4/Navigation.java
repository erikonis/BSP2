public class Navigation {
    // Road type constants with associated data
    private enum RoadType {
        MOTORWAY(1, "motorway", 130),
        ORDINARY(2, "ordinary", 90),
        TOWN(3, "town", 50),
        CALMED(4, "calmed", 30);

        final int id;
        final String name;
        final int speedLimit;

        RoadType(int id, String name, int speedLimit) {
            this.id = id;
            this.name = name;
            this.speedLimit = speedLimit;
        }

        static RoadType fromId(int id) {
            for (RoadType type : values()) {
                if (type.id == id) return type;
            }
            return null;
        }
    }

    // Route definition
    private static final int[] ROUTE = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};

    public static void main(String[] args) {
        printRouteDescription();
        printMinimalDrivingTime();
    }

    private static void printRouteDescription() {
        System.out.println("Route road types:");
        for (int typeId : ROUTE) {
            RoadType type = RoadType.fromId(typeId);
            System.out.println(type != null ? type.name : "unknown");
        }
    }

    private static void printMinimalDrivingTime() {
        double totalMinutes = 0;
        
        for (int typeId : ROUTE) {
            RoadType type = RoadType.fromId(typeId);
            if (type != null) {
                totalMinutes += 60.0 / type.speedLimit;
            }
        }

        System.out.printf("%nMinimal driving time: %.2f minutes%n", totalMinutes);
    }
}