import java.util.Scanner;

public class PointInRectangleAlternative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter point P coordinates (x y):");
        double[] pCoords = readCoordinates(scanner, 2);

        System.out.println("Enter rectangle coordinates (xmin ymin xmax ymax):");
        double[] rectCoords = readCoordinates(scanner, 4);

        if (rectCoords.length != 4 || pCoords.length != 2) {
            System.out.println("Error: Invalid number of coordinates entered.");
            scanner.close();
            return;
        }

        double xP = pCoords[0];
        double yP = pCoords[1];
        double xmin = Math.min(rectCoords[0], rectCoords[2]);
        double ymin = Math.min(rectCoords[1], rectCoords[3]);
        double xmax = Math.max(rectCoords[0], rectCoords[2]);
        double ymax = Math.max(rectCoords[1], rectCoords[3]);

        boolean isInside = (xP >= xmin && xP <= xmax && yP >= ymin && yP <= ymax);

        System.out.println("Point P(" + xP + ", " + yP + ") is " +
                           (isInside ? "inside" : "outside") +
                           " the rectangle (" + xmin + ", " + ymin + ") - (" + xmax + ", " + ymax + ").");

        scanner.close();
    }

    // Helper function to read a specified number of coordinates from the scanner
    private static double[] readCoordinates(Scanner scanner, int count) {
        double[] coords = new double[count];
        for (int i = 0; i < count; i++) {
            if (scanner.hasNextDouble()) {
                coords[i] = scanner.nextDouble();
            } else {
                System.out.println("Error: Invalid coordinate input.");
                return new double[0]; // Indicate an error
            }
        }
        return coords;
    }
}