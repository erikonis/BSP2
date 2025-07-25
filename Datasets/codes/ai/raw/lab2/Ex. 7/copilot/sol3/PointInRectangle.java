import java.util.Scanner;

public class PointInRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the coordinates of the point P
        System.out.print("Enter the x-coordinate of point P: ");
        double xP = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of point P: ");
        double yP = scanner.nextDouble();

        // Read the coordinates of the rectangle
        System.out.print("Enter the x-coordinate of the rectangle's minimum point: ");
        double xmin = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of the rectangle's minimum point: ");
        double ymin = scanner.nextDouble();
        System.out.print("Enter the x-coordinate of the rectangle's maximum point: ");
        double xmax = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of the rectangle's maximum point: ");
        double ymax = scanner.nextDouble();

        // Check if the point P is inside the rectangle
        boolean isInside = (xP >= xmin && xP <= xmax && yP >= ymin && yP <= ymax);

        if (isInside) {
            System.out.println("The point P(" + xP + ", " + yP + ") is inside the rectangle.");
        } else {
            System.out.println("The point P(" + xP + ", " + yP + ") is outside the rectangle.");
        }

        scanner.close();
    }
}
