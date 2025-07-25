package lu.uni.programming1.lab4.ex4;

import java.util.Scanner;

public class Norm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter dimension: ");
        int dimension = scanner.nextInt();

        if (dimension <= 0) {
            System.out.println("Invalid dimension!");
            scanner.close();
            return;
        }

        System.out.print("Enter vector: ");
        double[] vector = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            vector[i] = scanner.nextDouble();
        }

        double squareSum = 0.0;
        for (int i = 0; i < dimension; i++) {
            squareSum += vector[i] * vector[i];
        }

        double norm = Math.sqrt(squareSum);

        System.out.println("Norm of the vector: " + norm);

        scanner.close();
    }
}