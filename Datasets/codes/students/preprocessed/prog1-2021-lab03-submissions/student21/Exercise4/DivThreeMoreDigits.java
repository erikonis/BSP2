import java.util.Scanner;

public class DivThreeMoreDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        System.out.println("Please enter your number");

		long number, remainder;
		long sum = 0;

		
        number = scanner.nextInt();
		System.out.println(" Your number is: " + number);

		System.out.println(" The sum of the digits is: ");

		

		while (number>0) {
			remainder = number % 10;
			sum = sum + remainder ;
			number = number/10 ;
		}
		

	

			System.out.println(sum);

			if (sum%3 == 0) 
			System.out.println( "The number is divisible by three!");

			else System.out.println("The number is not divisible by three!");



			scanner.close();
		}
        
    }
    

