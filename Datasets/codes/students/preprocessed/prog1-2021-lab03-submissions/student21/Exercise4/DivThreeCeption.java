import java.util.Scanner;

public class DivThreeCeption {

    public static void main(String[] args) {

        
  Scanner scanner = new Scanner (System.in);


        System.out.println("Please enter your number");

	int number, remainder, sum = 0;

		
        number = scanner.nextInt();
		System.out.println(" Your number is: " + number);

		System.out.println(" The sum of the digits is: ");

		while (number>9) {

			sum=0;

		while (number>0) {
			remainder = number % 10;
			sum = sum + remainder ;
			number = number/10 ;
		}
		number = sum ;

	}


			System.out.println(sum);

            switch (sum) {

                case 0 : System.out.println( "The number is divisible by 3");
                break;
                case 3 :System.out.println( "The number is divisible by 3");
                break;
                case 6 :System.out.println( "The number is divisible by 3");
                break;
                case 9 :System.out.println( "The number is divisible by 3");
                break;
                default: System.out.println("The number is not divisible by 3");


            }


			scanner.close();
		}
        
    }