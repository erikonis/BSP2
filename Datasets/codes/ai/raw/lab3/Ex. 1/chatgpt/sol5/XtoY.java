import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble(), d = sc.nextDouble();
        for (double i = x; d > 0 ? i <= y : i >= y; i += d) {
            System.out.printf("%.2f\n", i);
        }
    }
}
