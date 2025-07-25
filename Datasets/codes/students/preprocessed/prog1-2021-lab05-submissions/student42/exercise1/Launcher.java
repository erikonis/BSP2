import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = scann.nextDouble();
        double b = scann.nextDouble();
        double c = scann.nextDouble();

        quadratic equation = new quadratic(a, b, c);
        equation.getRoots();
        scann.close();
    }
}