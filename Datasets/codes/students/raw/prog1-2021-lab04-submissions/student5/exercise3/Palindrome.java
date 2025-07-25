package lu.uni.programming1.lab4.exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input char (0 to end):");
		//initialise palindrome sting and input
		char Palindrome[] = {};
		char input = Character.toLowerCase(scanner.next(".").charAt(0));
		
		//keep asking till input is 0
		while (!String.valueOf(input).equals("0")){
			Palindrome = Arrays.copyOf(Palindrome, Palindrome.length + 1);
			Palindrome[Palindrome.length-1] = input;
			System.out.println(Arrays.toString(Palindrome));
			input = Character.toLowerCase(scanner.next(".").charAt(0));
		}
		scanner.close();
		
		//check if Palindrome[a] = Palindrome[length-a-1] is true in all cases
		boolean paltruth = true;
		for (int i = 0; i < (Palindrome.length/2); i++){
			if (Palindrome[i] != Palindrome[Palindrome.length-(i+1)]){
				paltruth = false;
			}
		}

		//print string as word
		for (int i = 0; i < Palindrome.length; i++){
			System.out.print(Palindrome[i]);
		}
		System.out.print("\nis Palindrome: " + paltruth + "\n");
	}
}
