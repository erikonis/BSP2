package lu.uni.programming1.lab3.exercise8.ex4;
import java.util.*;
public class DivThreeCeption {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n=0.0;
        int sum=0;
		System.out.println("enter your number");

		n = scanner.nextDouble();
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
		System.out.println("the sum of the digits is "+sum);
        switch (sum) {
            case 3,6,9:
                System.out.println("the number is divisible by 3");
                break;
        
            default:
                System.out.println("the number is not divisiible by 3");
                break;
        }

	scanner.close();
	}
}
