import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double d = sc.nextDouble();

        if (d == 0) return;

        for (double i = x; d > 0 ? i <= y : i >= y; i += d) {
            System.out.println(i);
        }
    }
}
