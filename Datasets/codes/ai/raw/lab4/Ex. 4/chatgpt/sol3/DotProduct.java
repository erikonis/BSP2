import java.util.Scanner;

public class DotProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dimension of the vectors: ");
        int n = sc.nextInt();

        double[] v1 = new double[n];
        double[] v2 = new double[n];

        System.out.println("Enter elements of the first vector:");
        for (int i = 0; i < n; i++) {
            v1[i] = sc.nextDouble();
        }

        System.out.println("Enter elements of the second vector:");
        for (int i = 0; i < n; i++) {
            v2[i] = sc.nextDouble();
        }

        double dotProduct = 0;
        for (int i = 0; i < n; i++) {
            dotProduct += v1[i] * v2[i];
        }

        System.out.println("Dot product: " + dotProduct);

        sc.close();
    }
}
