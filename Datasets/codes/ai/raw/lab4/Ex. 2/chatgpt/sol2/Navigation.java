// Navigation.java
public class Navigation {
    public static void main(String[] args) {
        // Static initialization of road types
        int[] roadTypes = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};

        // Output the list of road types in textual format using switch expression
        for (int roadType : roadTypes) {
            String roadTypeName = switch (roadType) {
                case 1 -> "motorway";
                case 2 -> "ordinary";
                case 3 -> "town";
                case 4 -> "calmed";
                default -> "unknown";
            };
            System.out.print(roadTypeName + " ");
        }
        System.out.println();
    }
}
