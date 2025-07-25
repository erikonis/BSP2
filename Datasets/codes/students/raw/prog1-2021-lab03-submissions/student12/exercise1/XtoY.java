package lu.uni.programming1.lab3.exercise1;
import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        double x, y,d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your first number:");
        x = scanner.nextDouble();
        System.out.println("Please type your second number:");
        y = scanner.nextDouble();
        System.out.println("Please type the step with which you want to count:");
        d = scanner.nextDouble();

        if (x > y) {
            double help = x;
            x = y;
            y= help;
        }
        System.out.println("Counting from smaller digit to larger digit :");
        for (double i = x; i <= y; i=i+d) {
            System.out.printf("%n %.2f",i);
        }
        scanner.close();
    }
    
}
