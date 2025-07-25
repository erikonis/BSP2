import java.util.Scanner;

public class Norm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //asks the user the amount of dimensions
        System.out.print("How many dimensions do you want your vector to have? ");

        //vector with n dimension is created
        int dimensions = scanner.nextInt();
        double vector[];
        vector = new double [dimensions];

        //user enters value of each dimension of the vector
        for (int i = 0; i < dimensions; ++i){
            System.out.print("Please enter the value of the dimension " + (i+1) + ": ");
            vector[i] = scanner.nextDouble();
        }

        scanner.close();

        double norm = 0;

        //calculates euclidian norm
        for (int i = 0; i < dimensions; i++) {
            norm += vector[i]*vector[i];
        }

        System.out.println("The euclidian norm of this vector is: " + Math.sqrt(norm));
    }   
}
