import java.util.Scanner;

public class QuadraticTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coefficients a b c (separate them with a space): ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Quadratic.getDiscriminant(a, b, c);
        double[] roots = Quadratic.getRoots(a, b, c);

        if (discriminant > 0) {
            System.out.println("There are two roots:");
            System.out.println("Root1: " + roots[0]);
            System.out.println("Root2: " + roots[1]);
        } else if (discriminant == 0) {
            System.out.println("There is one root: " + roots[0]);
        } else {
            System.out.println("The equation has no roots!");
        }
    }
}