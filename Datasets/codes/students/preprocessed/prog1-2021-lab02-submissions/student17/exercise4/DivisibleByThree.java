import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number: ");
		int number= scanner.nextInt();
		int sumOfDigits=0;
		for(int i=0; i<= 4; i++)
		{
			sumOfDigits+=number%10;
			number/=10;
		}
		String result= sumOfDigits%3==0 ? "number is divisible by 3" : "number is not divisible by 3";
		System.out.println(result);

		scanner.close();
	}
}