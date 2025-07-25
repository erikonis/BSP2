import java.util.Scanner;

public class PointInRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read point coordinates
        System.out.print("Enter xP: ");
        double xP = scanner.nextDouble();
        System.out.print("Enter yP: ");
        double yP = scanner.nextDouble();

        // Read rectangle bounds
        System.out.print("Enter xmin: ");
        double xmin = scanner.nextDouble();
        System.out.print("Enter ymin: ");
        double ymin = scanner.nextDouble();
        System.out.print("Enter xmax: ");
        double xmax = scanner.nextDouble();
        System.out.print("Enter ymax: ");
        double ymax = scanner.nextDouble();

        // Normalize bounds if entered in reverse
        double xLeft = Math.min(xmin, xmax);
        double xRight = Math.max(xmin, xmax);
        double yBottom = Math.min(ymin, ymax);
        double yTop = Math.max(ymin, ymax);

        // Check if point is inside or on the edge
        boolean isInside = (xP >= xLeft && xP <= xRight) && (yP >= yBottom && yP <= yTop);

        // Output result
        System.out.println(isInside
            ? "The point is inside the rectangle."
            : "The point is outside the rectangle.");

        scanner.close();
    }
}
