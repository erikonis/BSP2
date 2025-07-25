// Exercise 1.4: XtoY.java
import java.util.Scanner;
public class XtoY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double d = scanner.nextDouble();
        scanner.close();
        for (double i = x; i <= y; i += d) {
            System.out.println(i);
        }
    }
}

