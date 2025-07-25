package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;

public class kellacci_sequence {
    
    public static void main(String[] args) {
        // TODO code application logic here
        //define the variables 
        int firstNumber =1, secondNumber = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int number = input.nextInt();
        System.out.print(firstNumber+" "+secondNumber);
        //let's start the sequence at 2 since we already have two values in the sequence
        for(int i=2; i<number; ++i)
        {
            int thirdNumber = (secondNumber - 1) + (firstNumber*2);
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            System.out.print(" "+thirdNumber);
        }
        
    }
    
}


