import java.util.Scanner;

public class xToY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for X: ");

        // This method reads the number provided using keyboard
        double x = scanner.nextDouble();
        System.out.print("Enter a number for Y: ");

        double y = scanner.nextDouble();
        System.out.print("Enter a number for D: ");

        double d = scanner.nextDouble();
        double i;

        // Closing Scanner after the use
        scanner.close();
        for (i = x; i <= y; i += d) {
            System.out.printf("%.2f\n", i);
        }
    }
}
