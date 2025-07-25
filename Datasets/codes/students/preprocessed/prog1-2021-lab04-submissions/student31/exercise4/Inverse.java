import java.util.Scanner;

public class Inverse {
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
        
        //stores old vector
        double oldvector[];
        oldvector = vector.clone();

        //inverses vector and outputs it
        for (int i = 0; i < dimensions; ++i) {
            vector[i] = oldvector[dimensions-1-i];
            System.out.println(vector[i]);
        }

        scanner.close();
    }
}
