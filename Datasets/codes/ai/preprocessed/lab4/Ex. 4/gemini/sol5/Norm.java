import java.util.Scanner;

// Norm.java
public class Norm {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter the dimension of the vector: ");
        int vectorLength = inputReader.nextInt();

        double[] vectorElementsArray = new double[vectorLength];
        System.out.println("Enter the elements of the vector:");
        for (int i = 0; i < vectorLength; i++) {
            vectorElementsArray[i] = inputReader.nextDouble();
        }

        double sumOfSquaresOfElements = 0;
        for (double elementValue : vectorElementsArray) {
            sumOfSquaresOfElements += elementValue * elementValue;
        }
        double vectorMagnitudeValue = Math.sqrt(sumOfSquaresOfElements);

        System.out.println("The Euclidean norm (magnitude) of the vector is: " + vectorMagnitudeValue);
        inputReader.close();
    }
}