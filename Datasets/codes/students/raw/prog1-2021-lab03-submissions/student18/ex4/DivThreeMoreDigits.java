package lu.uni.programming1.lab3.ex4;
import java.util.Scanner;
public class DivThreeMoreDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//ask the user to enter a number
		System.out.println("Please enter a number");
		//Define some a long variable
		long number =scanner.nextLong();
		//define a integer variable
		int sum=0;
		System.out.println("********************************");
		//we use a while loop
		//as long as number is bigger than 0
		while (0<number)
		{
			//we add the modulo 10 of the number to sum
			sum+=number%10;
			// we divide the given number to 10
			number=number/10;
		}
		//we use switch
		switch (sum%3)
		{
			//if the case is 0
			//so the given number is divisible by 3
			case 0:
			System.out.println("divisible by 3");
			//break
			break;
			//default value
			//so the given number is not divisible by 3
			default:
			System.out.println("not divisible by 3");
			//break
			break;
		
		}
		System.out.println("******************************************************************");
		//close the
		scanner.close();
	}
}