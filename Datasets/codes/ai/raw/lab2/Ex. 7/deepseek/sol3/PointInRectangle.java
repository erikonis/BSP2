import java.util.Scanner;
import java.util.function.Predicate;

public class PointInRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read point coordinates
        System.out.print("Enter x-coordinate of point P: ");
        double xP = scanner.nextDouble();
        System.out.print("Enter y-coordinate of point P: ");
        double yP = scanner.nextDouble();

        // Read rectangle coordinates
        System.out.print("Enter xmin of rectangle: ");
        double xmin = scanner.nextDouble();
        System.out.print("Enter ymin of rectangle: ");
        double ymin = scanner.nextDouble();
        System.out.print("Enter xmax of rectangle: ");
        double xmax = scanner.nextDouble();
        System.out.print("Enter ymax of rectangle: ");
        double ymax = scanner.nextDouble();

        // Define a predicate to check if the point is inside the rectangle
        Predicate<Double> isInsideX = x -> x >= xmin && x <= xmax;
        Predicate<Double> isInsideY = y -> y >= ymin && y <= ymax;

        // Check if the point is inside the rectangle
        boolean isInside = isInsideX.test(xP) && isInsideY.test(yP);

        // Display the result
        System.out.println("The point (" + xP + ", " + yP + ") is " + (isInside ? "inside" : "outside") + " the rectangle.");
    }
}