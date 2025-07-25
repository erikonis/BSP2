import java.util.Scanner;

public class InverseVector {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter vector dimension N: ");
            int n = readPositiveInt(scanner);
            
            double[] vector = readVector(scanner, n);
            double[] inverse = computeInverse(vector);
            
            System.out.println("Inverse vector:");
            printVector(inverse);
        }
    }

    private static int readPositiveInt(Scanner scanner) {
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a positive integer:");
                scanner.next();
                continue;
            }
            int n = scanner.nextInt();
            if (n > 0) return n;
            System.out.println("Dimension must be positive:");
        }
    }

    private static double[] readVector(Scanner scanner, int n) {
        double[] vector = new double[n];
        System.out.println("Enter vector components:");
        for (int i = 0; i < n; i++) {
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number:");
                scanner.next();
            }
            vector[i] = scanner.nextDouble();
        }
        return vector;
    }

    private static double[] computeInverse(double[] vector) {
        double[] inverse = new double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            inverse[i] = -vector[i];
        }
        return inverse;
    }

    private static void printVector(double[] vector) {
        for (double v : vector) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}