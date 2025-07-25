import java.util.Scanner;
public class XtoY {

	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
		//enter your first number
		System.out.print("Please enter your decimal Number: ");
		//define a double
		double number1 = numbers.nextInt();
		//enter your second number
		System.out.print("Please enter your decimal Number: ");
		//define your second double
		double number2 = numbers.nextInt();
		//define your 3rd double
		double number3 = numbers.nextInt();
		//for-loop x to y in step d
		for (double s = number1; s < number2; s=s+number3) {
			System.out.println(s);//output
		  }
		//close
		numbers.close();
	}
}