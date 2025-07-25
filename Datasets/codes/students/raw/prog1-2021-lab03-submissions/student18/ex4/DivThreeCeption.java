package lu.uni.programming1.lab3.ex4;
import java.util.Scanner;
public class DivThreeCeption {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("******************************************************************");
		//enter a number
		System.out.println("Please enter a number");
		//define a long variable
		long number =scanner.nextLong();
		//define a integer
		int sum=0;
		while (0<number)
		{
			//0+=12%10=2
			sum+=number%10; 
			//12=12/10=1.2
			number=number/10; 
			//while the number is bigger than 10...
			while (9<number) 
			// as long as the number is bigger than 10
				{
					if( number==0 ) 
					// the given number's value is equal to 0
					{
						number = sum; 
						//1.2=2
						sum=0; 
						// 0
					}
					// we add the modulo 10 of the number to sum
					sum+=number%10; 
					//we divide the number through 10
					number=number/10; 
				}
		}
		//use switch
		switch (sum%3)
		{
			//if the case is 0
			//the number is divisble by 3
			case 0:
			System.out.println("divisible by 3");
			//break
			break;
			//default
			//the number is divisible by 3
			default:
			System.out.println("not divisible by 3");
			break;


		
		}
		System.out.println("******************************************************************");
		//close the scanner
		scanner.close();
	}
}