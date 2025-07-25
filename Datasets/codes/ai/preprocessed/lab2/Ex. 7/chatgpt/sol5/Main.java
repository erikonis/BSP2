import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter xP: ");
        double xP = scanner.nextDouble();
        System.out.print("Enter yP: ");
        double yP = scanner.nextDouble();

        System.out.print("Enter xmin: ");
        double xmin = scanner.nextDouble();
        System.out.print("Enter ymin: ");
        double ymin = scanner.nextDouble();
        System.out.print("Enter xmax: ");
        double xmax = scanner.nextDouble();
        System.out.print("Enter ymax: ");
        double ymax = scanner.nextDouble();

        Point p = new Point(xP, yP);
        Rectangle rect = new Rectangle(xmin, ymin, xmax, ymax);

        if (rect.contains(p)) {
            System.out.println("The point is inside the rectangle.");
        } else {
            System.out.println("The point is outside the rectangle.");
        }

        scanner.close();
    }
}