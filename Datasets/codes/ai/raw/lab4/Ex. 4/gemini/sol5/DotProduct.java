import java.util.Scanner;

// DotProduct.java
public class DotProduct {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter the dimensionality of the vectors: ");
        int vectorDimensionality = inputReader.nextInt();

        double[] firstVector = new double[vectorDimensionality];
        System.out.println("Enter the components of the first vector:");
        for (int i = 0; i < vectorDimensionality; i++) {
            firstVector[i] = inputReader.nextDouble();
        }

        double[] secondVector = new double[vectorDimensionality];
        System.out.println("Enter the components of the second vector:");
        for (int i = 0; i < vectorDimensionality; i++) {
            secondVector[i] = inputReader.nextDouble();
        }

        double scalarProductResult = 0;
        for (int i = 0; i < vectorDimensionality; i++) {
            scalarProductResult += firstVector[i] * secondVector[i];
        }

        System.out.println("The dot (scalar) product of the two vectors is: " + scalarProductResult);
        inputReader.close();
    }
}