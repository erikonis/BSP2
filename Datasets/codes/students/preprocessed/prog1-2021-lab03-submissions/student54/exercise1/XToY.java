import java.util.Scanner;

public class XToY {
    public static void main(String[] args) {
        double x, y, d;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number for x:");
        x = scanner.nextDouble();
        System.out.println("Please enter a number for y:");
        y = scanner.nextDouble();
        System.out.println("Please enter a number for d:");
        d = scanner.nextDouble();

        while (x <= y) {
            System.out.print(x);
            if (x + d > y) {
                System.out.println(".");
            } else {
                System.out.print(", ");
            }
            x += d;
        }
        scanner.close();
    }
}
