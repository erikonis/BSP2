import java.util.Scanner;

public class DivisibleByThree {
	static int[] nums = new int[4];
	static int sum;
	static int total;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		for (int i = 0; i < 4; i++){
			System.out.println("Please enter a number : ");
			nums[i] = sc.nextInt();
			total += nums[i];
		}
		CalculateSum(total);
	}

	public static int CalculateSum(int total){
		if (total % 2 == 0) {
			isDivisible();
		} else {
			isNotDivisible();
		}
		return total;
	}
	public static void isDivisible(){
		System.out.println("Is divisible by 2.");
	}
	public static void isNotDivisible(){
		System.out.println("Sum is not divisible by 2");
	}
}