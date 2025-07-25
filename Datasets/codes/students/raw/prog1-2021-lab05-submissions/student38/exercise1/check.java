package exercise1;

import java.util.Scanner;
public class check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ia;
        int ib;
        int ic;
        System.out.println("Input coefficients for the equation ax^2 + bx + c = 0");
        System.out.print("Input the three numbers separated by a space: ");
        ia = scanner.nextInt();
        ib = scanner.nextInt();
        ic = scanner.nextInt();
        //setting up the variables for the equation. Inputting "x y z" with spaces between the three numbers can be read with a single input
        Quadratic q = new Quadratic(ia,ib,ic);
        //imports the numbers into the class

        System.out.println("The equation is:");
        System.out.println(q.getEquation());
        System.out.println("Discriminant: "+q.getDiscriminant());
        //prints the equation nicely and the discriminant.
        if (q.getDiscriminant()>0){
            System.out.println("There are two roots");
            System.out.println("Root 1: "+q.getRoot1());
            System.out.println("Root 2: "+q.getRoot2());}
            //if the discriminant is bigger than 0, two roots are possible, calculated and printed
        if (q.getDiscriminant()==0){
            System.out.println("There is one root: ");
            if ((q.getRoot1()).isNaN() == false){
                System.out.print(q.getRoot1());}
                if ((q.getRoot2()).isNaN() == true){
                    System.out.print(q.getRoot2());}}
            //if the discriminant is 0, it has one root, then checks which root results in an error, and prints the other one
        if (q.getDiscriminant()< 0){
            System.out.println("The equation has no roots!");}
            //if the equation has no roots it just says so.
        scanner.close();
    }
}
