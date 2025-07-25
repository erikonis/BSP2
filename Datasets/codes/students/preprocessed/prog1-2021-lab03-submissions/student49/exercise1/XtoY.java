import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter n:");
        double n = scanner.nextDouble();
        System.out.println("Please enter m:");
        double m = scanner.nextDouble();
        System.out.println("Please enter d:");
        double d = scanner.nextDouble();

        for(double i=n;i<=m;i+=d)
        {
            System.out.println(i);
        }
        scanner.close();
    }
}
