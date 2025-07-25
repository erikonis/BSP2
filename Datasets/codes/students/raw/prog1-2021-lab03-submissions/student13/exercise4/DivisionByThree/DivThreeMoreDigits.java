package lu.uni.programming1.lab3.exercise4.DivisionByThree;

import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		long number;
		long sumOfNumbers =0;
		System.out.println("Please put in the number you want to check: ");
		number = scanner.nextLong();
        scanner.close();

		while(number > 0)
		{
			sumOfNumbers =  sumOfNumbers + number%10;
			number = number/10;
        }

        if(sumOfNumbers%3 == 0)
        {
            System.out.print("Yes the number that you chose is divisible by three!");
        }
        else
        {
            System.out.print("No the number that you chse is not divisible by three!");
        }
    }
}
