import java.util.Scanner;
import java.util.InputMismatchException;

public abstract class VectorOperations {
    protected static double[] readVector(Scanner scanner, int dimension) {
        double[] vector = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            while (true) {
                try {
                    System.out.printf("Enter component %d: ", i + 1);
                    vector[i] = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();
                }
            }
        }
        return vector;
    }

    protected static void printVector(double[] vector) {
        System.out.print("Result: [");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    protected static int readDimension(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Enter vector dimension (N > 0): ");
                int n = scanner.nextInt();
                if (n > 0) return n;
                System.out.println("Dimension must be positive.");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }
    }
}