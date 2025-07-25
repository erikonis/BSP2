import java.util.Scanner;

public class PointInRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the coordinates of the point P
        System.out.print("Enter the x-coordinate of point P: ");
        double xP = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of point P: ");
        double yP = scanner.nextDouble();
        Point point = new Point(xP, yP);

        // Read the coordinates of the rectangle
        System.out.print("Enter the x-coordinate of the rectangle's minimum point: ");
        double xmin = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of the rectangle's minimum point: ");
        double ymin = scanner.nextDouble();
        System.out.print("Enter the x-coordinate of the rectangle's maximum point: ");
        double xmax = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of the rectangle's maximum point: ");
        double ymax = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(xmin, ymin, xmax, ymax);

        // Check if the point P is inside the rectangle using the method in Point class
        boolean isInside = point.isInside(rectangle);

        if (isInside) {
            System.out.println("The point P(" + xP + ", " + yP + ") is inside the rectangle.");
        } else {
            System.out.println("The point P(" + xP + ", " + yP + ") is outside the rectangle.");
        }

        scanner.close();
    }
}
