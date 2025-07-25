import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dimension of vector: ");
        int n = input.nextInt();

        double[] vector = new double[n];
        System.out.println("Enter vector elements:");
        for (int i = 0; i < n; i++) {
            vector[i] = input.nextDouble();
        }

        System.out.println("Inverse vector:");
        for (double val : vector) {
            System.out.print(-val + " ");
        }

        input.close();
    }
}