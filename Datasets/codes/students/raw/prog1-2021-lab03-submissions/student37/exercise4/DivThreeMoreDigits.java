package lu.uni.programming1.lab3.exercise4;
import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        long n = scanner.nextLong();
        scanner.close();

        long lastDigit = 0;
		long rest = n;
		int sum = 0;

		while (rest >= 1){
		lastDigit = rest % 10;
		sum += lastDigit; 
		rest = rest / 10;
        }

        System.out.println( "The sum of digits is: " + sum ); 

        if (sum > 10){
            do {rest = sum;
                sum = 0;
                while (rest >= 1){
                    lastDigit = rest % 10;
                    sum += lastDigit; 
                    rest = rest / 10;
                    }
                System.out.println( "The sum of digits is: " + sum ); 
            }
            while ( sum >=10);
        }

        switch (sum) {
            case 0, 3, 6, 9:
                System.out.println("Divisible by 3!");
                break; 
            case 1, 2, 4, 5, 7, 8:
                System.out.println("Not divisible by 3!");
                break;
            default:
                System.out.println("invalid answer ...");
                break; 
        }

    }
    
}
