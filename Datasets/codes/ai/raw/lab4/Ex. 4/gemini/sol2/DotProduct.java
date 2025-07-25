import java.util.Scanner;

// DotProduct.java
public class DotProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension N of the vector space: ");
        int n = scanner.nextInt();

        double[] v1 = new double[n];
        System.out.println("Enter the elements of the first vector v1:");
        for (int i = 0; i < n; i++) {
            v1[i] = scanner.nextDouble();
        }

        double[] v2 = new double[n];
        System.out.println("Enter the elements of the second vector v2:");
        for (int i = 0; i < n; i++) {
            v2[i] = scanner.nextDouble();
        }

        double dotProduct = 0;
        for (int i = 0; i < n; i++) {
            dotProduct += v1[i] * v2[i];
        }

        System.out.println("The dot product of v1 and v2 is: " + dotProduct);
        scanner.close();
    }
}