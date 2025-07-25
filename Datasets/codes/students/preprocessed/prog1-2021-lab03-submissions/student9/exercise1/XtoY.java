import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter x :");
        double x = scanner.nextDouble();
        System.out.print("enter y :");
        double y = scanner.nextDouble();
        System.out.print("enter D :");
        double d = scanner.nextDouble();
        double i;
        scanner.close();
        for (i = x; i <= y; i += d) {
            System.out.printf("%.1f", i);
        }
    }
}
