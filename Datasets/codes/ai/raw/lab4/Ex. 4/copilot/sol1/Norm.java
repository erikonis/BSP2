package lab04.Ex. 4.copilot.sol2;

public package exercise4;

import java.util.Scanner;

public class Norm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dimension N of the vector:");
        int N = scanner.nextInt();
        double[] vector = new double[N];

        System.out.println("Enter the vector elements:");
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextDouble();
        }

        double norm = 0;
        for (double v : vector) {
            norm += v * v;
        }
        norm = Math.sqrt(norm);

        System.out.println("The Euclidean norm of the vector is: " + norm);
    }
} {
    
}
