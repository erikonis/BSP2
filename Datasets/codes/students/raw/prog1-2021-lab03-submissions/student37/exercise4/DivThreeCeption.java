package lu.uni.programming1.lab3.exercise4;
import java.util.Scanner;

public class DivThreeCeption {
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
        if (sum % 3 == 0){
            System.out.println("Divisible by 3!");
            }
        else{
            System.out.println("Not divisible by 3!");
        } 
    }
    
}
