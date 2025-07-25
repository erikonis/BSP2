import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type X: ");
        float x = scanner.nextFloat();
        System.out.println("Please type Y: ");
        float y = scanner.nextFloat();
        System.out.println("please type D: ");
        float d = scanner.nextFloat();
        for (float i = x; i <= y; i += d) {
            System.out.printf("Step: %.2f\n" , i);
        }
        scanner.close();
    }
}
