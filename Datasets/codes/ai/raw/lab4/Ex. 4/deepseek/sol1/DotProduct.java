package exercise4;

import java.util.Scanner;

public class DotProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension N: ");
        int n = scanner.nextInt();
        double[] vector1 = new double[n];
        double[] vector2 = new double[n];

        System.out.println("Enter the elements of the first vector:");
        for (int i = 0; i < n; i++) {
            vector1[i] = scanner.nextDouble();
        }

        System.out.println("Enter the elements of the second vector:");
        for (int i = 0; i < n; i++) {
            vector2[i] = scanner.nextDouble();
        }

        double dotProduct = 0;
        for (int i = 0; i < n; i++) {
            dotProduct += vector1[i] * vector2[i];
        }

        System.out.println("Dot product: " + dotProduct);
    }
}