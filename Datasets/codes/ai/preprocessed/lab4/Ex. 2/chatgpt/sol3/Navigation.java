public class Navigation {
    public static void main(String[] args) {
        // Static initialization of road types
        int[] roadTypes = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};

        // Output the list of road types in textual format and calculate minimal driving time
        double totalTime = 0;
        for (int roadType : roadTypes) {
            double speedLimit = switch (roadType) {
                case 1 -> 130;
                case 2 -> 90;
                case 3 -> 50;
                case 4 -> 30;
                default -> 0;
            };

            // Time = distance / speed, distance is 1 km
            double timeForSegment = 1.0 / speedLimit;  // in hours
            totalTime += timeForSegment;
        }

        // Convert total time to minutes
        double totalTimeInMinutes = totalTime * 60;
        System.out.println("Minimal driving time: " + totalTimeInMinutes + " minutes.");
    }
}