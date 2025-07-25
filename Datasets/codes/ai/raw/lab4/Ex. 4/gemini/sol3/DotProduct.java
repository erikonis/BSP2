import java.util.Scanner;

// DotProduct.java
public class DotProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter vector dimension: ");
        int size = input.nextInt();

        double[] vectorA = new double[size];
        System.out.println("Enter elements of the first vector:");
        for (int i = 0; i < size; i++) {
            vectorA[i] = input.nextDouble();
        }

        double[] vectorB = new double[size];
        System.out.println("Enter elements of the second vector:");
        for (int i = 0; i < size; i++) {
            vectorB[i] = input.nextDouble();
        }

        double product = 0;
        for (int i = 0; i < size; i++) {
            product += vectorA[i] * vectorB[i];
        }

        System.out.println("Dot product: " + product);
        input.close();
    }
}