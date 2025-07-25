import java.util.Scanner;

public class Quadratic {

    private static double a;
    private static double b;
    private static double c;

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static double getA() {
        return a;
    }

    public static double getB() {
        return b;
    }

    public static double getC() {
        return c;
    }

    public static double getDesciminant() {
        return (Math.pow(getB(), 2) - (4 * getA() * getC()));
    }

    public static double getRoot1() {
        return ((-getB() + (Math.sqrt(getDesciminant()))) / (2 * getA()));
    }

    public static double getRoot2() {
        return ((-getB() - (Math.sqrt(getDesciminant()))) / (2 * getA()));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        new Quadratic(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        if (getDesciminant() < 0) {
            System.out.println("The equation has no roots!");
        } else if (getDesciminant() == 0) {
            System.out.println("There is one root: " + getRoot1());
        } else if (getDesciminant() > 0) {
            System.out.println("There are two roots: ");
            System.out.println("Root1: " + getRoot1());
            System.out.println("Root2: " + getRoot2());
        }

        scanner.close();
    }
}