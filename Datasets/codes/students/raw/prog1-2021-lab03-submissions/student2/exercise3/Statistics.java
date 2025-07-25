package lu.uni.programming1.lab3.exercise3;

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input the n number: ");
        
         int number = scanner.nextInt();

         int biggest = scanner.nextInt();

         int smallest = scanner.nextInt();

         double average = 0;

         int number2 = 0;
        
        while (number != 0) {
            
            System.out.print("Please input the n number: ");
            
            number = scanner.nextInt();

            if (number > biggest) {
                biggest = number;
            }

            if (number < smallest) {
                smallest = number;
            } 

            average = average + number;
            number2++;

        }

        

        if (number == 0) {
            System.out.println("The average is : " + average / (number2 - 1));
        }

        System.out.println("Here's the biggest number: " + biggest);

        System.out.println("Here's the smallest number: " + smallest);



        scanner.close();
    }
}
