import java.util.Scanner;

public class Roots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coefficients a b c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        Quadratic ec = new Quadratic(a, b, c);
        System.out.println(ec);
        if (ec.getDiscriminant() > 0) {
            System.out.println("There are 2 roots:");
            System.out.println("Root 1: " + ec.getRoot1());
            System.out.println("Root 2: " + ec.getRoot2());
        } else if (ec.getDiscriminant() == 0)
            System.out.println("There is 1 root: " + ec.getRoot1());
        else
            System.out.println("There are no roots for this equation!");
        ;

        scanner.close();

    }

}
