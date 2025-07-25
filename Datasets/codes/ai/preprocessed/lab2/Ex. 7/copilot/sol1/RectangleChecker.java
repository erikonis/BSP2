import java.util.Scanner;

public class RectangleChecker {
    public static void checkPointInRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter xP: ");
        int xP = scanner.nextInt();
        System.out.print("Enter yP: ");
        int yP = scanner.nextInt();
        System.out.print("Enter xmin: ");
        int xmin = scanner.nextInt();
        System.out.print("Enter ymin: ");
        int ymin = scanner.nextInt();
        System.out.print("Enter xmax: ");
        int xmax = scanner.nextInt();
        System.out.print("Enter ymax: ");
        int ymax = scanner.nextInt();

        boolean isInside = (xP >= xmin && xP <= xmax && yP >= ymin && yP <= ymax);
        System.out.println("Point P(" + xP + ", " + yP + ") is " + (isInside ? "inside" : "outside") + " the rectangle.");
    }
}