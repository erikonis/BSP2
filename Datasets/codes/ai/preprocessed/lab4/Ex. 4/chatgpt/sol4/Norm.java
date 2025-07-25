import java.util.Scanner;

public class Norm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dimension of vector: ");
        int n = input.nextInt();

        double[] vector = new double[n];
        double sum = 0;

        System.out.println("Enter vector elements:");
        for (int i = 0; i < n; i++) {
            vector[i] = input.nextDouble();
            sum += vector[i] * vector[i];
        }

        double norm = Math.sqrt(sum);
        System.out.printf("Euclidean norm: %.3f\n", norm);

        input.close();
    }
}