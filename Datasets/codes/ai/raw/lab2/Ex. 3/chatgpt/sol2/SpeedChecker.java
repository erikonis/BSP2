import java.util.Scanner;

public class SpeedChecker {

    enum RoadType {
        MOTORWAY(1, "motorway", 130),
        ORDINARY(2, "ordinary", 90),
        TOWN(3, "town", 50),
        CALMED(4, "calmed", 30);

        private final int id;
        private final String name;
        private final int speedLimit;

        RoadType(int id, String name, int speedLimit) {
            this.id = id;
            this.name = name;
            this.speedLimit = speedLimit;
        }

        public int getId() {
            return id;
        }

        public String getRoadName() {
            return name;
        }

        public int getSpeedLimit() {
            return speedLimit;
        }

        public static RoadType fromId(int id) {
            for (RoadType rt : values()) {
                if (rt.getId() == id) {
                    return rt;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter road type ID (1-4): ");
        int typeId = scanner.nextInt();

        System.out.print("Enter driver's speed: ");
        int speed = scanner.nextInt();

        RoadType roadType = RoadType.fromId(typeId);

        if (roadType == null) {
            System.out.println("Unknown road type: " + typeId);
        } else {
            int limit = roadType.getSpeedLimit();
            String roadName = roadType.getRoadName();

            if (speed <= limit) {
                System.out.println("Speed OK for " + roadName + " road.");
            } else {
                int excess = speed - limit;
                double percentageExcess = ((double) excess / limit) * 100;
                int fine = calculateFine(percentageExcess);

                System.out.println("Too fast for " + roadName + " road. " + excess + " over the limit!");
                System.out.println("Fine: €" + fine);
            }
        }
    }

    private static int calculateFine(double percentageExcess) {
        if (percentageExcess <= 5) {
            return 0;
        } else if (percentageExcess <= 30) {
            return 50;
        } else if (percentageExcess <= 50) {
            return 150;
        } else {
            return 500;
        }
    }
}
