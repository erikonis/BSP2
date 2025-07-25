import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the coefficients a b c (separate them with a space) : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        Quadratic q = new Quadratic(a, b, c);
        double d = q.getDiscriminant();

        if (d > 0) {
            System.out.println("There are two roots:");
            System.out.println("Root1: " + q.getRoot1());
            System.out.println("Root2: " + q.getRoot2());
        } else if (d == 0) {
            System.out.println("There is one root: " + q.getRoot1());
        } else {
            System.out.println("The equation has no roots!");
        }

        sc.close();
    }
}