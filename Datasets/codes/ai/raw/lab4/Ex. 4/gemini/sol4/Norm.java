import java.util.Scanner;

// Norm.java
public class Norm {
    public static void main(String[] args) {
        Scanner consoleIn = new Scanner(System.in);
        System.out.print("Enter the vector's dimension: ");
        int vectorDimension = consoleIn.nextInt();

        double[] vectorElements = new double[vectorDimension];
        System.out.println("Enter the elements of the vector:");
        for (int i = 0; i < vectorDimension; i++) {
            vectorElements[i] = consoleIn.nextDouble();
        }

        double sumOfSquares = 0;
        for (double element : vectorElements) {
            sumOfSquares += element * element;
        }
        double vectorMagnitude = Math.sqrt(sumOfSquares);

        System.out.println("The Euclidean norm of the vector is: " + vectorMagnitude);
        consoleIn.close();
    }
}