import java.util.Scanner;

public class MatrixVectorMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //asks the user the amount of dimensions
        System.out.print("How many dimensions do you want your vector and matrix to have? ");

        //vector and matrix with n dimension is created
        int dimensions = scanner.nextInt();
        double vector[];
        vector = new double [dimensions];

        double matrix[][];
        matrix = new double [dimensions][dimensions];

        //user enters value of each dimension of the vector
        for (int i = 0; i < dimensions; ++i){
            System.out.print("Please enter the value of the dimension " + (i+1) + " of the vector: ");
            vector[i] = scanner.nextDouble();
        }

        //user enters value of each dimension of the matrix
        for (int i = 0; i < dimensions; i++) {
            for (int j = 0; j < dimensions; j++) {
                System.out.print("Please enter the value of the dimension " + (i+1) + "x" + (j+1) + "of the matrix: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        scanner.close();

        System.out.println("The multiplication of the vector and the matrix is: ");

        //calculates and outputs multiplication
        for (int i = 0; i < dimensions; i++) {
            for (int j = 0; j < dimensions; j++) {
                matrix[i][j] *= vector[i];
                System.out.print(matrix[i][j] + " ");
            }
            //Goes to the next line
            System.out.print("\n");
        }
    }
}
