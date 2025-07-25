package lu.uni.programming1.lab2.exercise5;

import java.util.*;

/**
 *  Class for Exercise 5.2
 */
public class SortingNotNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		// Asks input of the 3 numbers to sort
		System.out.println("Enter 3 numbers you want to sort:");
		for (int i = 0; i < 3; i++) {
			nums.add(scanner.nextInt());
		}

		// Sorts the list of numbers
		Collections.sort(nums);
		System.out.println(nums);
		
		scanner.close();
	}
}
