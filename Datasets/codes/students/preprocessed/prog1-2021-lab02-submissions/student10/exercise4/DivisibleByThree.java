import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number=scanner.nextInt();

		int sum=0;

		while(number>0){
			sum = sum +number%10;
			number = number/10;
		}
		System.out.println(sum);

		boolean isDivBy3 = (sum % 3==0) ? true : false;
		System.out.println("the number "+number+" divisability by 3 is "+isDivBy3);

		scanner.close();
	}
}