package lu.uni.programming1.lab5.exercise1;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        VariablesConstructor vC = new VariablesConstructor();

        System.out.print("Enter the coefficients a b c (separate them with a space) ");

        int[] coefficients = new int[3]; // initialise array to store numbers inside

        for (int i = 0; i < coefficients.length; i++) {
            coefficients[i] = scan.nextInt(); // create a loop to store values inside the array and be able to use space to add to array
                                              
        }

        vC.setA(coefficients[0]);
        vC.setB(coefficients[1]);//set coefficients
        vC.setC(coefficients[2]);

        double discriminant = vC.getDiscriminant();
        String roots = Roots(discriminant);
        System.out.println(roots);
        double root = vC.getRoot();
        double root1 = vC.getRoot1();
        double root2 = vC.getRoot2();

        if (discriminant > 0) {
            System.out.printf("%.1f \n%.1f", root1, root2);
        } 
        else if (discriminant == 0) {
            System.out.printf("%.1f", root);
            }

        scan.close();
    }

    public static String Roots(double gD) {

        if (gD > 0) {
            return "There are two roots:";
        } else if (gD == 0) {
            return "There is one root: ";
        } else {
            return "The equation has no roots!";
        }
    }
}
