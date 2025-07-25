import java.util.Scanner;

public class XtoYWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();
        System.out.print("Enter step d: ");
        double d = scanner.nextDouble();
        double i = x;
        while (i <= y) {
            System.out.println(i);
            i += d;
        }
    }
}