package quadratic;

import java.util.Arrays;
import java.util.Scanner;

public class QuadraticTestStatic {

    public static void main(Stringargs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coefficients a b c (separate them with a space) : ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        doubleroots = QuadraticUtils.solveQuadratic(a, b, c);

        if (roots.length == 2) {
            System.out.println("There are two roots: " + Arrays.toString(roots));
        } else if (roots.length == 1) {
            System.out.println("There is one root: " + roots[0]);
        } else {
            System.out.println("The equation has no roots!");
        }

        scanner.close();
    }
}