import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double d = sc.nextDouble();
        for (double i = x; i <= y; i += d)
            System.out.println(i);
        sc.close();
    }
}