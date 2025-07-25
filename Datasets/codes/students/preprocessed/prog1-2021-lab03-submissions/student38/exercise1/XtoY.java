import java.util.Scanner;

public class XtoY {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for X: ");
        double x = scanner.nextDouble();

        System.out.println("Enter the number for Y: ");
        double y = scanner.nextDouble();

        System.out.println("Enter the number for D: ");
        double d = scanner.nextDouble();

        double j;

        scanner.close();

        for (j = x; j <= y; j += d)
            System.out.printf("%.2f\n", j);

    }
}
