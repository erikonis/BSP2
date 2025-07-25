import java.util.Scanner;
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1 =scanner.nextInt();
		int sum=0;
		System.out.println("*************");
		for (int s= 0; s< 4; s++) {
			int value = (int)((number1/Math.pow(10, s))%10); // 10^2= 100 => math.pow
			sum= sum + value;
		  }
		  System.out.println("*************");
		  System.out.println(sum%3==0? "is divisible by 3" : " is not divisble by 3");		  
		scanner.close();
	}
}