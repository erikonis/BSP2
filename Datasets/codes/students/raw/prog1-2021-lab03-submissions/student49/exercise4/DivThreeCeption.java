package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivThreeCeption {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long lastDigit = 0;
		long sum = 0;
		

		System.out.print("Please enter a number: ");
		long a = scanner.nextLong();

        while(a>9)
        {
            
		    while(a>0)	
		    {
			    lastDigit = a%10;
			    sum += lastDigit;
			    a = a/10;
		    }
            a=sum;
            sum=0;
        }   

		boolean divisible;

		switch((int)a)
		{
			case 3: divisible = true;
					break;
			case 6: divisible = true;
					break;
			case 9: divisible = true;
					break;
			default: divisible = false;
					break;

		}

		System.out.println(divisible ? "true" : "false");

		scanner.close();
	}
}