import java.util.Scanner;

public class Norm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension N of the vector: ");
        int n = scanner.nextInt();

        double[] vector = new double[n];
        double sum = 0;
        System.out.println("Enter the vector elements:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextDouble();
            sum += vector[i] * vector[i];
        }

        double norm = Math.sqrt(sum);
        System.out.println("Euclidean norm of the vector: " + norm);
    }
}