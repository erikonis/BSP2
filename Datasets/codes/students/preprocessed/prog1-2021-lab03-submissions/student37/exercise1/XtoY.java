import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter x value: ");
        double x = scanner.nextDouble();
        System.out.print("Please enter y value: ");
        double y = scanner.nextDouble();
        System.out.print("Please enter the incremental steps d value: ");
        double d = scanner.nextDouble();
        scanner.close();

        for (double num=x ; num<=y ; num=num+d) {
            System.out.println(num);
            }   
    }
      
}
