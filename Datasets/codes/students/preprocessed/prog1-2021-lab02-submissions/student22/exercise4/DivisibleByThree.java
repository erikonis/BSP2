import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String number = scanner.next();
		int sum = 0;
		for (int i = 0; i < number.length(); i++){
			int j = Character.digit(number.charAt(i), 10);
			System.out.println("digit: " + j);
			sum = sum + j;
			
		}
		System.out.println("sum: " + sum);
		String divisible = sum %3==0? "is divisible by 3"
		: "is not divisible by 3";
		
		System.out.println(divisible);

		scanner.close();
	}
}