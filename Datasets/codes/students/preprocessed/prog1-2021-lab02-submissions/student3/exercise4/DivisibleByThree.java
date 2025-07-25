import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		int firstdigit,sum,input = 0;
		sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the digit:");

	    input = scanner.nextInt();
		while(input>0){
		firstdigit= input % 10;
		sum = sum + firstdigit;
		input= input / 10;
		}
		System.out.println("Sum of Digits: " + sum);
        String result=	(sum%3==0)? ("Yes it is divisble by 3."): ("NO.");
		System.out.println(result);
		
		

		scanner.close();
	}
}