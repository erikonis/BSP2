import java.util.Scanner;

// DotProduct.java
public class DotProduct {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.print("Enter the dimension of the vectors: ");
        int vectorDimension = consoleIn.nextInt();

        double[] vector1 = new double[vectorDimension];
        System.out.println("Enter the components of the first vector:");
        for (int i = 0; i < vectorDimension; i++) {
            vector1[i] = consoleIn.nextDouble();
        }

        double[] vector2 = new double[vectorDimension];
        System.out.println("Enter the components of the second vector:");
        for (int i = 0; i < vectorDimension; i++) {
            vector2[i] = consoleIn.nextDouble();
        }

        double scalarProduct = 0;
        for (int i = 0; i < vectorDimension; i++) {
            scalarProduct += vector1[i] * vector2[i];
        }

        System.out.println("The dot product of the two vectors is: " + scalarProduct);
        consoleIn.close();
    }
}