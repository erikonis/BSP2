import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public Point readPoint() {
        System.out.println("Enter the coordinates of point P (xP yP):");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        return new Point(x, y);
    }

    public Rectangle readRectangle() {
        System.out.println("Enter the coordinates of the rectangle (xmin ymin xmax ymax):");
        double xmin = scanner.nextDouble();
        double ymin = scanner.nextDouble();
        double xmax = scanner.nextDouble();
        double ymax = scanner.nextDouble();
        return new Rectangle(xmin, ymin, xmax, ymax);
    }
}