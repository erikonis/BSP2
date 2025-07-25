import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		int startNumber = number;
		int a = 0;
		int b = 0;
		int c = 0;

		while (number > 0) {
			a = number % 10;
			number = number / 10;
			b = b + a;
		}

		int d = b;

		if(b>9){
			while (b > 0) {
				a = b % 10;
				b = b / 10;
				c = c + a;
			}
			if((c % 3) == 0){
				System.out.println(startNumber + " is divisible by 3, because the sum of the sum of the numbers digits digits (" + c + ") is divisible by 3.");
			}else{
				System.out.println(startNumber + " is not divisible by 3, because the sum of the sum of the numbers digits digits (" + c + ") is not divisible by 3.");
			}
		}else{
			if((d % 3) == 0){
				System.out.println(startNumber + " is divisible by 3, because the sum of the numbers digits (" + d + ") is divisible by 3.");
			}else{
				System.out.println(startNumber + " is not divisible by 3, because the sum of the numbers digits (" + d + ") is not divisible by 3.");
			}
		}
		
		

		scanner.close();
	}
}