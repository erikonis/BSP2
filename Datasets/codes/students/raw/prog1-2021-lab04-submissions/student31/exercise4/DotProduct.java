package lu.uni.programming1.lab4.exercise4;

import java.util.Scanner;

public class DotProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //asks the user the amount of dimensions
        System.out.print("How many dimensions do you want your vectors to have? ");

        //vectors with n dimensions are created
        int dimensions = scanner.nextInt();

        double vector1[]; double vector2[];
        vector1 = new double [dimensions]; vector2 = new double [dimensions];

        //user enters value of each dimension of the vector
        for (int i = 0; i < dimensions; ++i){

            //vector1
            System.out.print("Please enter the value of the dimension " + (i+1) + " of the first verctor: ");
            vector1[i] = scanner.nextDouble();

            //vector2
            System.out.print("Please enter the value of the dimension " + (i+1) + " of the second vector: ");
            vector2[i] = scanner.nextDouble();
        }

        scanner.close();

        //calculates dot product
        double product = 0;
        for (int i = 0; i < dimensions; i++) {
            product += vector1[i] * vector2[i];
        }

        System.out.println("The dot product of these two vectors is: " + product);
    }
}
