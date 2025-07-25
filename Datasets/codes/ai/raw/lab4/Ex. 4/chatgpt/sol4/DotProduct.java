import java.util.Scanner;

public class DotProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dimension of vectors: ");
        int n = input.nextInt();

        double[] v1 = new double[n];
        double[] v2 = new double[n];
        System.out.println("Enter elements for vector 1:");
        for (int i = 0; i < n; i++) v1[i] = input.nextDouble();

        System.out.println("Enter elements for vector 2:");
        for (int i = 0; i < n; i++) v2[i] = input.nextDouble();

        double dot = 0;
        for (int i = 0; i < n; i++) dot += v1[i] * v2[i];

        System.out.println("Dot product: " + dot);

        input.close();
    }
}
