import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x value: ");
        float x = scanner.nextFloat();
        System.out.print("Enter y value: ");
        float y = scanner.nextFloat();
        System.out.print("Enter d value: ");
        float d = scanner.nextFloat();

        for (float i = x; i <= y; i=i+d) {
            System.out.printf("%.2f ", i);
        }
        scanner.close();
    }
}
