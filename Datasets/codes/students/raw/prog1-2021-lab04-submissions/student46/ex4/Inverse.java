package lu.uni.programming1.lab4.ex4;

import java.util.Scanner;

public class Inverse {
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

        double[] inverse = new double[dimension];

        for (int i = 0; i < dimension; i++) {
            inverse[i] = -vector[i];
        }

        System.out.println("Inverse of the vector: ");
        for (int i = 0; i < dimension; i++) {
            System.out.print(inverse[i] + ((i < dimension - 1) ? "," : ""));
        }

        scanner.close();

    }
}