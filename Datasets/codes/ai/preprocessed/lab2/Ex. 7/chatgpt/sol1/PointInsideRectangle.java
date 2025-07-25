import java.util.Scanner;

public class PointInsideRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read rectangle bounds
        System.out.print("Enter rectangle coordinates (xmin ymin xmax ymax): ");
        int xmin = scanner.nextInt(), ymin = scanner.nextInt(), xmax = scanner.nextInt(), ymax = scanner.nextInt();

        // Read point coordinates
        System.out.print("Enter point coordinates (xP yP): ");
        int xP = scanner.nextInt(), yP = scanner.nextInt();
        scanner.close();

        boolean inside = xP >= xmin && xP <= xmax && yP >= ymin && yP <= ymax;
        System.out.println(inside ? "Point is inside the rectangle." : "Point is outside the rectangle.");
    }
}