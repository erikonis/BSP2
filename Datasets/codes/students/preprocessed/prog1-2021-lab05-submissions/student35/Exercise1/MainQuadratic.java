import java.util.Scanner;

public class MainQuadratic {
    static Quadratic quadratic = new Quadratic();
    static Scanner scanner = new Scanner(System.in);
    static double a, b, c;

    public static void main(String[] args) {
        AskUser();
    }

    public static void AskUser() {
        System.out.println("Enter the coefficient for a: ");
        a = scanner.nextDouble();
        System.out.println("Enter the coefficient for b: ");
        b = scanner.nextDouble();
        System.out.println("Enter the coefficient for c: ");
        c = scanner.nextDouble();

        StartCalc(a, b, c);
    }

    private static void StartCalc(double a, double b, double c) {
        quadratic.getA(a);
        quadratic.getB(b);
        quadratic.getC(c);

        DoQuickMaths(a, b, c);
    }

    private static void DoQuickMaths(double a, double b, double c) {
        double quad = quadratic.getDiscriminant(a, b, c);

        if (quad > 0) {
            System.out.println("Root 1 :" + quadratic.getRoot1(a, b, c));
            System.out.println("Root 2 :" + quadratic.getRoot2(a, b, c));
        } else if (quad == 0) {
            System.out.println("Root 1 :" + quadratic.getRoot1(a, b, c));
        } else {
            System.out.println("The equation has no roots !");
        }
    }
}