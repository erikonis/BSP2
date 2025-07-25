import java.util.Scanner;

public class QuadraticTest {
    public static void main(Stringargs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coefficients a b c (separate them with a space) : ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        Quadratic quadratic = new Quadratic(a, b, c);
        double discriminant = quadratic.getDiscriminant();

        if (discriminant > 0) {
            System.out.println("There are two roots:");
            System.out.println("Root1: " + quadratic.getRoot1());
            System.out.println("Root2: " + quadratic.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("There is one root: " + quadratic.getRoot1());
        } else {
            System.out.println("The equation has no roots!");
        }

        scanner.close();
    }
}