import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x, y, d;
        System.out.println("Please enter the value x: ");
        x = scanner.nextDouble();
        System.out.println("Please enter the value of y: ");
        y = scanner.nextDouble();
        System.out.println("Please enter the value of d: ");
        d = scanner.nextDouble();

        for(double i = x; i <= y; i+=d){
            System.out.printf("%.2f ", i);
        }
       scanner.close();

        
    }
}
