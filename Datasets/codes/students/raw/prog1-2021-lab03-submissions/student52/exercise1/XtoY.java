package lu.uni.programming1.lab3.exercise1;
import java.util.Scanner;

public class XtoY {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number for 'X':");
        double x = scanner.nextDouble();

        System.out.println("Please enter the number for 'Y':");
        double y = scanner.nextDouble();

        System.out.println("Please enter the steps for 'd':");
        double d = scanner.nextDouble();

        System.out.println("---------");

        for(double i=x; i<=y; i+=d){
            System.out.format("%f\n" ,i);
        }

        scanner.close();
    }
}
