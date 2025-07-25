package Exercises.exercise1;

import java.util.Scanner;

public class QE {
    private double a, b, c;

    QE(double va, double vb, double vc) {
        a = va;
        b = vb;
        c = vc;
    }

    public double geta() {
        return a;
    }

    public double getb() {
        return b;
    }

    public double getc() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public double getRoot1() {
        return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    }

    public double getRoot2() {
        return (-b - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your the value of a here: ");
        double va = scanner.nextDouble();
        System.out.println("Type your the value of b here: ");
        double vb = scanner.nextDouble();
        System.out.println("Type your the value of c here: ");
        double vc = scanner.nextDouble();
        QE q1 = new QE(va, vb, vc);
        if (q1.getDiscriminant() > 0) {
            System.out.println("There are two roots: ");
            System.out.println(" Root1: " + q1.getRoot1());
            System.out.println(" Root2: " + q1.getRoot2());
        }
        if (q1.getDiscriminant() == 0) {
            System.out.println("There is one root: " + q1.getRoot1());
        }
        if (q1.getDiscriminant() < 0) {
            System.out.println("The equation has no roots!");
        }
        scanner.close();

    }

}
