import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting decimal number (x):");
        double x = scanner.nextDouble();
        System.out.println("Enter the ending decimal number (y):");
        double y = scanner.nextDouble();
        System.out.println("Enter the step size (d):");
        double d = scanner.nextDouble();

        for (double i = x; i <= y; i += d) {
            System.out.println(i);
        }
    }
}