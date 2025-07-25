package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer number: ");
        //if number negative gets converted to positive, works same way
        long number = Math.abs(scanner.nextLong());

        int sum = 0;

        do {
            //if second time in loop sum and number get inversed because we make the sum of both of the old sum
            if (sum >= 10) {
                number = sum;
                sum = 0;
            }

            while (number > 0) {
                sum += number % 10;
                number = (number - number % 10) / 10;
            }
        //repeats if sum isn't a single digit
        } while (sum >= 10);
        
        //is the number divisible by 3?
        switch (sum) {
            case 3, 6, 9:
                System.out.println("The number is divisible by three.");
                break;
        
            default:
                System.out.println("The number is not divisible by three.");
                break;
        }

        scanner.close();
    }
}