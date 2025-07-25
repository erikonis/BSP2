import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // OneToFive
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // OneTo100
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // NtoM
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        for (int i = n; i <= m; i++) {
            System.out.println(i);
        }

        // XtoY
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();
        System.out.print("Enter step d: ");
        double d = scanner.nextDouble();
        for (double i = x; i <= y; i += d) {
            System.out.println(i);
        }
    }
}