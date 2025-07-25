package exercise2;

public class Navigation {
    public static void main(String[] args) {
        int[] roadTypes = {4, 3, 1, 2, 1, 3, 3, 4, 2, 4};

        for (int type : roadTypes) {
            String roadType = switch (type) {
                case 1 -> "motorway";
                case 2 -> "ordinary";
                case 3 -> "town";
                case 4 -> "calmed";
                default -> "unknown";
            };
            System.out.println(roadType);
        }
    }
}