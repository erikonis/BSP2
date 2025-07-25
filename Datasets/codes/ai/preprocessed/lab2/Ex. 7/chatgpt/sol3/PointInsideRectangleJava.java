import java.awt.Rectangle;
import java.util.Scanner;

public class PointInsideRectangleJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rectangle (xmin ymin xmax ymax): ");
        int xmin = scanner.nextInt(), ymin = scanner.nextInt(), xmax = scanner.nextInt(), ymax = scanner.nextInt();

        Rectangle rect = new Rectangle(xmin, ymin, xmax - xmin, ymax - ymin);

        System.out.print("Enter point coordinates: ");
        int xP = scanner.nextInt(), yP = scanner.nextInt();
        scanner.close();

        System.out.println(rect.contains(xP, yP) ? "Point is inside." : "Point is outside.");
    }
}