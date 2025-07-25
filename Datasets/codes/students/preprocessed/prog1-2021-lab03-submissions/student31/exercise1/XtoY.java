import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a minimum decimal number: ");
        double x = scanner.nextDouble();

        System.out.print("Please enter a maximum decimal number: ");
        double y = scanner.nextDouble();

        System.out.print("Please enter the steps: ");
        double d = scanner.nextDouble();

        for (double i = x; i <= y; i += d) {
            System.out.println(i);
        }

        scanner.close();
    }
}