package lu.uni.programming1.lab2.exercise4;
import java.util.Scanner;
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Define some integer variables
		int number1 =scanner.nextInt();
		int sum=0;
		System.out.println("*************");
		//we use a for loop instead of a if and else
		//the for loop give us each digit of a number back
		//then we add the value of those digits to the variable sum
		for (int s= 0; s< 4; s++) {
			int value = (int)((number1/Math.pow(10, s))%10); // 10^2= 100 => math.pow
			sum= sum + value;
		  }
		  System.out.println("*************");
		  //output
		  System.out.println(sum%3==0? "is divisible by 3" : " is not divisble by 3");		  
		scanner.close();
	}
}