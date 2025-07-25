package lu.uni.programming1.lab3.exercise3;

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int number = 0 ;
       int min = Integer.MAX_VALUE;
       int max = 0 ;
       double average = 0;
       double sum = 0;
       boolean condition = true;
       int count = 0;
       while(condition != false)
       {
           System.out.println("Please enter a number");
           number = scanner.nextInt();
           if(number == 0)
           {
               condition = false; 
           }
           else
           {
               count++;
                if(min>number && number != 0)
                {
                    min = number;  
                }
                if(max<number)
                {
                    max = number;
                }
                sum += number;
           }
       }
       //calculat average
       average = sum/count;
       //print
       System.out.println("The smallest number: " + min);
       System.out.println("The largest number: " + max);
       System.out.println("The average of all the numbers: " + average); 
       //scanner closed
       scanner.close();
    }
}
