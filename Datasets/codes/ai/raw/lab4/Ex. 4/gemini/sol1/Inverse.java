package ex4;

import java.util.Scanner;

public class Inverse {

    public static void main(Stringargs) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension N: ");
        int N = scanner.nextInt();

        doublevector = new double[N];
        System.out.println("Enter the vector components:");
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextDouble();
        }

        System.out.println("Inverse vector:");
        for (int i = 0; i < N; i++) {
            System.out.print(-vector[i] + " ");
        }
    }
}