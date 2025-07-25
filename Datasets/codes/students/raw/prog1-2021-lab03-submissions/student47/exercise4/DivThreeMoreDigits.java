package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeMoreDigits {
    
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you enter a number please : ");
        int number =scanner.nextInt();
        int coef = 1;
        int digit = 0;
        int sum = 0;

        
        do {
            digit = (number/coef)%10;
            coef = coef * 10;
            sum = digit + sum ;
            
        } while(coef<=number);
        
        System.out.println("The sum for the digit is : " + sum + 
        " and the modulo by 3 is :" + sum%3 );

        if (sum%3==0)
            System.out.println("The number " + number + " is divisible by 3.");
        else if (sum%3 !=0)
            System.out.println("The number" + number + "is not divisible by 3.");
    

        scanner.close();
        }

    }


