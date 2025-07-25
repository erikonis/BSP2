import java.util.Scanner;

public class PointInRectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinates of point P (xP yP):");
        double xP = scanner.nextDouble();
        double yP = scanner.nextDouble();

        System.out.println("Enter the coordinates of the rectangle (xmin ymin xmax ymax):");
        double xmin = scanner.nextDouble();
        double ymin = scanner.nextDouble();
        double xmax = scanner.nextDouble();
        double ymax = scanner.nextDouble();

        boolean isInside = isPointInsideRectangle(xP, yP, xmin, ymin, xmax, ymax);

        if (isInside) {
            System.out.println("Point P(" + xP + "; " + yP + ") is inside the rectangle (" +
                               xmin + ", " + ymin + ") - (" + xmax + ", " + ymax + ").");
        } else {
            System.out.println("Point P(" + xP + "; " + yP + ") is outside the rectangle (" +
                               xmin + ", " + ymin + ") - (" + xmax + ", " + ymax + ").");
        }

        scanner.close();
    }

    public static boolean isPointInsideRectangle(double xP, double yP, double xmin, double ymin, double xmax, double ymax) {
        // A point is inside a rectangle (with axis-parallel sides) if its x-coordinate
        // is within the range [xmin, xmax] and its y-coordinate is within the range [ymin, ymax].

        // We need to handle cases where xmin > xmax or ymin > ymax, although the
        // problem description implies a standard definition where xmin <= xmax and ymin <= ymax.
        // For robustness, we'll consider the effective boundaries.

        double effectiveMinX = Math.min(xmin, xmax);
        double effectiveMaxX = Math.max(xmin, xmax);
        double effectiveMinY = Math.min(ymin, ymax);
        double effectiveMaxY = Math.max(ymin, ymax);

        return (xP >= effectiveMinX && xP <= effectiveMaxX &&
                yP >= effectiveMinY && yP <= effectiveMaxY);
    }
}