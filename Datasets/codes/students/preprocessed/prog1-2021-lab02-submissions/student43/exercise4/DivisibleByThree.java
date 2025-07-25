import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insert number to check if it is divisible by 3: ");
		int num = scanner.nextInt();
		int sum = 0;
		int temp = Math.abs(num);
		for(temp = num; temp >= 10; temp = temp/10){
			sum = sum + temp%10;}
		sum = sum + temp;
		String result = sum%3 <= 0 ? (num+" is divisible by 3") : (num+" is not divisible by 3");
		System.out.println(result);

		scanner.close();}}