package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 *  Class for Exercise 5.1
 */
public class SortingNested {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three integers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		// Sort numbers
		int temp;
		if (num2 < num1 || num3 < num1)
		{
			if (num2 < num1)
			{
				temp = num1;
				num1 = num2;
				num2 = temp; 
			}
			if (num3 < num1)
			{
				temp = num1;
				num1 = num3;
				num3 = temp;
			}
		}
		if (num3 < num2)
		{
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		System.out.println(num1 + " " + num2 + " " + num3);
	}
}

	
		
	