package lu.uni.programming1.lab3.exercise4;
import java.util.Scanner;
public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a number:");
		long nbr = scanner.nextInt();
		long displaynbr = nbr;
		long sum = 0;
		while (nbr>0) {
			sum = sum + nbr % 10;
			nbr = nbr / 10;
		}

		System.out.println(
				sum % 3 == 0 ? displaynbr + " est divisible par 3." : displaynbr + " n'est pas divisible par 3.");

		scanner.close();
    }
}
