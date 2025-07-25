public package exercise4;

import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dimension N of the vector:");
        int N = scanner.nextInt();
        double[] vector = new double[N];

        System.out.println("Enter the vector elements:");
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextDouble();
        }

        System.out.println("The inverse of the vector is:");
        for (int i = 0; i < N; i++) {
            System.out.print(-vector[i] + " ");
        }
    }
} {

}