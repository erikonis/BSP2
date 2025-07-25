import java.util.Scanner;

public class mainQuadratic {
    public static void main(String[] args) {

        System.out.println("Enter the coefficients a, b, and c: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        input.close();
        Quadratic eq1 = new Quadratic(a, b, c);

        if (eq1.getDiscriminant() < 0) {
            System.out.println("The equation has no roots!");
        }

        else if (eq1.getDiscriminant() == 0) {
            System.out.printf("There is one root: %.1f", (eq1.getRoot1()));
        } else {
            System.out.println("There are two roots: ");
            System.out.printf("\t\tRoot1: %.1f \n", (eq1.getRoot1()));
            System.out.printf("\t\tRoot2: %.1f \n", (eq1.getRoot2()));
        }

    }
}