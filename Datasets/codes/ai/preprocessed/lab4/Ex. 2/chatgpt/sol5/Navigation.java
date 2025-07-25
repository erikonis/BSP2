public class Navigation {
    public static void main(String[] args) {
        // Static array of road type IDs for the route
        int[] roadTypeIds = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};

        // Total time accumulator
        double totalTimeInMinutes = 0;

        System.out.println("Navigation Route:");
        System.out.println("-----------------");

        for (int i = 0; i < roadTypeIds.length; i++) {
            int id = roadTypeIds[i];
            String typeName;
            int speedLimit;

            switch (id) {
                case 1:
                    typeName = "motorway";
                    speedLimit = 130;
                    break;
                case 2:
                    typeName = "ordinary";
                    speedLimit = 90;
                    break;
                case 3:
                    typeName = "town";
                    speedLimit = 50;
                    break;
                case 4:
                    typeName = "calmed";
                    speedLimit = 30;
                    break;
                default:
                    typeName = "unknown";
                    speedLimit = 1; // failsafe
                    break;
            }

            double timeForSegment = 60.0 / speedLimit; // 1 km per segment
            totalTimeInMinutes += timeForSegment;

            System.out.printf("Segment %d: %-8s (%dkm/h) - %.2f min%n",
                i + 1, typeName, speedLimit, timeForSegment);
        }

        System.out.println("-----------------");
        System.out.printf("Estimated minimum total time: %.2f minutes%n", totalTimeInMinutes);
    }
}