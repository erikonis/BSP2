import java.util.Scanner;

import javax.naming.NamingException;

public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("pls input number:");
			String str = scanner.nextLine();
			char[] n = str.toCharArray();
			int sum = 0;
			for (int i = 0; i < n.length;i++){
				sum = sum + ((int)n[i]);
				sum = sum-48;
			}
			System.out.println(sum);
			int a = sum %3;
			String sentence1 = a > 0
			? "is not divisible by 3"
			: "is divisible by 3";
			System.out.println(sentence1);	

		scanner.close();
	
	}
	
}