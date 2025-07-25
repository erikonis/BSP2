package exercise1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Quadratic q;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter values for a, b and c (seperate them with spaces):");
        q = new Quadratic(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.close();
        System.out.println(q.getDiscriminant() > 0 ? "Root 1: " + q.getSquareRoot1() + "\nRoot 2: " + q.getSquareRoot2()
                : q.getDiscriminant() == 0 ? "Root 0: " + q.getSquareRoot1() : "The equation has no roots");
    }
}
