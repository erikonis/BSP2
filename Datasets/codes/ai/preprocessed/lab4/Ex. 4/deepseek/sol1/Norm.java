public package exercise4;

import java.util.Scanner;

public class Norm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension N: ");
        int n = scanner.nextInt();
        double[] vector = new double[n];

        System.out.println("Enter the vector elements:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vector[i] * vector[i];
        }

        double norm = Math.sqrt(sum);
        System.out.println("Euclidean norm: " + norm);
    }
} {

}