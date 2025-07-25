public package exercise2;

public class NavigationWithTime {
    public static void main(String[] args) {
        int[] roadTypes = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};
        double totalTime = 0;

        for (int type : roadTypes) {
            double speedLimit = switch (type) {
                case 1 -> 130;
                case 2 -> 90;
                case 3 -> 50;
                case 4 -> 30;
                default -> 0;
            };
            totalTime += 1 / speedLimit; // Time in hours
        }

        double totalTimeMinutes = totalTime * 60; // Convert to minutes
        System.out.println("Minimal driving time: " + totalTimeMinutes + " minutes");
    }
} {

}