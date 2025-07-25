package lu.uni.programming1.lab3.exercise4;
import java.util.Scanner;
public class DivThreeMoreDigits {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please a number to be checked if it's divisible by 3: ");
		long num = sc.nextLong();
		long tmp,sum = 0;

		while (num> 0){

			tmp = num % 10;
			sum = sum + tmp;
			num = num /10;

		}

		

		String result = (sum%3 == 0)? "The sum of your number is divisible by 3" : "The sum of your number is not divisible by 3";
		System.out.println(result);

		sc.close();
	}
}
