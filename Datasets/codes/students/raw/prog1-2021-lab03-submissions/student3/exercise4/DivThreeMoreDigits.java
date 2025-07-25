package lu.uni.programming1.lab3.exercise4;
import java.util.Scanner;
public class DivThreeMoreDigits {

	public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int firstdigit,sum,input = 0;
		sum=0;
		System.out.print("Enter the digit:");

		// Reading the road type id from standard input
	    input = scanner.nextInt();
		while(input>0){
		firstdigit= input % 10;
		sum = sum + firstdigit;
		input= input / 10;
		}
		while (sum>10){
        sum=sumofdigits(sum);
		}
		System.out.println("Sum of Digits: " + sum);
        String result=	(sum%3==0)? ("Yes it is divisble by 3."): ("NO.");
		System.out.println(result);
		// TODO: put your code here
		
		scanner.close();
	}
	public static int sumofdigits(int input){
		int sum=0;
		int firstdigit;
		while(input>0){
			firstdigit= input % 10;
			sum = sum + firstdigit;
			input= input / 10;
			}
			return sum;
	}
}
