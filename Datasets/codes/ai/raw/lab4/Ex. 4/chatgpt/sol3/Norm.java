import java.util.Scanner;

public class Norm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dimension of the vector: ");
        int n = sc.nextInt();

        double[] vector = new double[n];
        double sumSquares = 0;

        System.out.println("Enter the vector elements:");
        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextDouble();
            sumSquares += vector[i] * vector[i];
        }

        double norm = Math.sqrt(sumSquares);
        System.out.printf("Euclidean norm: %.3f%n", norm);

        sc.close();
    }
}
