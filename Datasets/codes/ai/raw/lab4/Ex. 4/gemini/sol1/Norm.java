package ex4;

import java.util.Scanner;

public class Norm {

    public static void main(Stringargs) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension N: ");
        int N = scanner.nextInt();

        doublevector = new double[N];
        System.out.println("Enter the vector components:");
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextDouble();
        }

        double sumOfSquares = 0;
        for (double v : vector) {
            sumOfSquares += v * v;
        }

        double norm = Math.sqrt(sumOfSquares);
        System.out.println("Euclidean norm: " + norm);
    }
}