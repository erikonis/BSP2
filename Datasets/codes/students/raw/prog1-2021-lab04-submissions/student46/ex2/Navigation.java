package lu.uni.programming1.lab4.ex2;

public class Navigation {

    public static void main(String[] args) {
        // Ex 2.1
        int[] route = new int[] { 4, 3, 1, 2, 1, 3, 3, 4, 2, 4 };

        // Ex 2.2
        for (int i : route) {
            System.out.println(
                    switch (i) {
                    case 1 -> "motorway";
                    case 2 -> "ordinary";
                    case 3 -> "town";
                    case 4 -> "calmed";
                    default -> "unknown";
                    }
                            + " road");
        }

        // Ex 2.3
        double totalDuration = 0.0;
        for (int i : route) {
            double distanceInKM = 1.0;
            double speed = switch (i) {
                case 1 -> 130;
                case 2 -> 90;
                case 3 -> 50;
                case 4 -> 30;
                default -> 0;
            };

            double segmentDuration = distanceInKM * (60.0 / speed); // in minutes
            totalDuration += segmentDuration;
        }
        System.out.printf("The whole travel takes %.2f minutes\n", totalDuration);

    }
}