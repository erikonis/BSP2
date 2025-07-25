package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);
     long sum = 0;
     long digit = 0 ;

     
     System.out.println("enter the number : ");
     long number = scanner.nextInt();
     long NForPrint = number;
     while (number > 0) { 
     digit = number % 10;
     sum = sum + digit;
     number = number / 10;
       }
       long DI = sum % 3;
   String D = ( DI == 0) ? "Divisible":"not Divisible";
   System.out.println("the number " + NForPrint + "is "  + D + " by three.");


    scanner.close();


















    }
    
}
