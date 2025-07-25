import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();
        System.out.print("Enter step size d: ");
        double d = scanner.nextDouble();
        scanner.close();

        for (double i = x; i <= y; i += d) {
            System.out.println(i);
        }
    }
}
