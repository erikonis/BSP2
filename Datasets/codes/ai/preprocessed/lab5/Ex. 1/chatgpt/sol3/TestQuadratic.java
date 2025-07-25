import java.util.Scanner;

public class TestQuadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coefficients a b c (separate them with a space) : ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        Quadratic equation = new Quadratic(a, b, c);
        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            System.out.println("There are two roots:");
            System.out.println("Root1: " + equation.getRoot1());
            System.out.println("Root2: " + equation.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("There is one root: " + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots!");
        }

        scanner.close();
    }
}