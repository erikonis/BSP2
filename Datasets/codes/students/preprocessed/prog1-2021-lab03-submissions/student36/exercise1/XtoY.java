import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double x, y, d;
    System.out.println("Enter a decimal number x: ");
    x = scanner.nextDouble();
    System.out.println("Enter a decimal number y: ");
    y = scanner.nextDouble();
    System.out.println("Enter the steps of d: ");
    d = scanner.nextDouble();
    System.out.println("Decimal numbers from x to y in steps of d: ");
    for (double i = x; i <= y; i += d) {
    System.out.println(i);
    }
    scanner.close();
    }
}
