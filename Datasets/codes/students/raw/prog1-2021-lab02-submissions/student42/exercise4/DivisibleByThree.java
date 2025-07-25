package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n;
		int sum =0;

		System.out.println("Please type an integer number between -9999 and 9999: ");

		n = scanner.nextInt();

		if ((n>=10000) || (n<=-10000))  {System.exit(0);};

		String s = Integer.toString(n); 

		int[] intArray = new int[s.length()]; 
		
		for(int i=0; i<s.length(); i++){
			intArray[i] = Character.getNumericValue(s.charAt(i));
		}

		for(int j=0; j<s.length(); j++){
			sum += intArray[j];
		}

		if (sum%3==0) {System.out.println("The number is divisible by 3! ");}
		else {System.out.println("The number is not divisible by 3. ");};
		scanner.close();
	}
}