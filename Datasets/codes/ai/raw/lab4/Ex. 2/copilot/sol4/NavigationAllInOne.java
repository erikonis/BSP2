package lab04.Ex. 2.copilot.sol4;

public package exercise2;

public class NavigationAllInOne {
    public static void main(String[] args) {
        int[] roadTypes = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};
        double totalTime = 0;

        for (int roadType : roadTypes) {
            String roadTypeName = switch (roadType) {
                case 1 -> "motorway";
                case 2 -> "ordinary";
                case 3 -> "town";
                case 4 -> "calmed";
                default -> "unknown";
            };
            System.out.print(roadTypeName + " ");

            double speedLimit = switch (roadType) {
                case 1 -> 130;
                case 2 -> 90;
                case 3 -> 50;
                case 4 -> 30;
                default -> 0;
            };
            totalTime += 1 / speedLimit * 60; // time in minutes
        }

        System.out.println("\nTotal driving time: " + totalTime + " minutes");
    }
} {
    
}
