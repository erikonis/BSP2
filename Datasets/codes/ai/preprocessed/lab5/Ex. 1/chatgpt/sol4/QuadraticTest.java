import java.util.Scanner;

public class QuadraticTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the coefficients a b c (separate them with a space) : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        Quadratic eq = new Quadratic(a, b, c);
        double d = eq.getDiscriminant();

        if (d > 0) {
            System.out.println("There are two roots:");
            System.out.println("Root1: " + eq.getRoot1());
            System.out.println("Root2: " + eq.getRoot2());
        } else if (d == 0) {
            System.out.println("There is one root: " + eq.getRoot1());
        } else {
            System.out.println("The equation has no roots!");
        }

        input.close();
    }
}