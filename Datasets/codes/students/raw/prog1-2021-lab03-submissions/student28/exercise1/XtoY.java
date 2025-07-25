package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;


public class XtoY {

   
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter first number");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("Enter last number");
        int y = input.nextInt();
        System.out.println("Enter number of steps");
        int d = input.nextInt();
        for(int i = x; i<y+1; i=i+d)
        {
            System.out.println(i);
        }
    }
}