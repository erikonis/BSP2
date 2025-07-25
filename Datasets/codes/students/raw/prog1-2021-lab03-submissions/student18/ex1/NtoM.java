package lu.uni.programming1.lab3.ex1;
import java.util.Scanner;
public class NtoM {
	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
		//please enter a number
		System.out.print("Please enter your first Number: ");
		//define a integer
		int number1 = numbers.nextInt();
		//please enter your seconde number
		System.out.print("Please enter your second Number: ");
		//define a second integer
		int number2 = numbers.nextInt();
		// for-loop for n to m
		for (int s = number1; s < number2; s=s+1) {
			System.out.println(s); //output
		  }
		//close
		numbers.close();
	}
}