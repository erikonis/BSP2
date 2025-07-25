package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class XtoY {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Asks for input
        System.out.println("Enter the first and last number you want to print:");
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        System.out.println("Now enter the by which step you want to count:");
        float d = sc.nextFloat();

        // Prints from given x to given y by given step d
        for(float i = x; i <= y; i+=d){
            System.out.println(i);
        }    
        
        sc.close();
    }
}
