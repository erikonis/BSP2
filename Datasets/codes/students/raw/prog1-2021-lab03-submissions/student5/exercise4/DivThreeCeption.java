package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeCeption {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("insert value:");
		long variable = scanner.nextLong();
		scanner.close();

		//repeat operation untill variable only has 1 digit
		while (variable > 10){
			long digit = 0;
			long sum = 0;

			//sum of digits
			while (variable>0){
				digit = variable % 10;
				sum += digit;
				variable /= 10;
			}
			variable = sum;
			System.out.println(variable);
		}

		//ystem.out.println("divisible by 3: " + (variable%3==0));

		switch (Math.toIntExact(variable)) {
			case 3:
			case 6:
			case 9:
				System.out.println("divisible by 3");
			break;
		}
		
	}
}
