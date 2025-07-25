import java.util.Scanner;

public class PointInRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read point coordinates
        System.out.print("Enter x-coordinate of point P: ");
        double xP = scanner.nextDouble();
        System.out.print("Enter y-coordinate of point P: ");
        double yP = scanner.nextDouble();
        Point point = new Point(xP, yP);

        // Read rectangle coordinates
        System.out.print("Enter xmin of rectangle: ");
        double xmin = scanner.nextDouble();
        System.out.print("Enter ymin of rectangle: ");
        double ymin = scanner.nextDouble();
        System.out.print("Enter xmax of rectangle: ");
        double xmax = scanner.nextDouble();
        System.out.print("Enter ymax of rectangle: ");
        double ymax = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(xmin, ymin, xmax, ymax);

        // Check if the point is inside the rectangle
        boolean isInside = rectangle.containsPoint(point);

        // Display the result
        System.out.println("The point (" + xP + ", " + yP + ") is " + (isInside ? "inside" : "outside") + " the rectangle.");
    }
}