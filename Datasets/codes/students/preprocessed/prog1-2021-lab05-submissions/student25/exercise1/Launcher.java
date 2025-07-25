import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coefficients a b c (separate them with a space) : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        Quadriatic eq = new Quadriatic(a, b, c);

        int discriminant = eq.getDiscriminant();

        if (discriminant > 0) {
            System.out.println("There are two roots: ");
            System.out.println("Root 1: " + eq.getRoot1());
            System.out.println("Root 2: " + eq.getRoot2());

        } else if (discriminant == 0) {
            System.out.println("There is one root: " + eq.getRoot1());
        } else {
            System.out.println("The equation has no roots!");
        }

        scanner.close();
    }
}
