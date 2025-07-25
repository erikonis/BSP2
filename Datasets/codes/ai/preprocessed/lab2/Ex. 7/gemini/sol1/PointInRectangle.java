import java.util.Scanner;

public class PointInRectangle {
    public static void main(Stringargs) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter point coordinates (xP yP): ");
        int xP = scanner.nextInt();
        int yP = scanner.nextInt();

        System.out.print("Enter rectangle coordinates (xmin ymin xmax ymax): ");
        int xmin = scanner.nextInt();
        int ymin = scanner.nextInt();
        int xmax = scanner.nextInt();
        int ymax = scanner.nextInt();

        if (xP >= xmin && xP <= xmax && yP >= ymin && yP <= ymax) {
            System.out.println("Point is inside the rectangle.");
        } else {
            System.out.println("Point is outside the rectangle.");
        }
    }
}