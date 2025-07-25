package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 *  Class for Exercise 5.1
 */
public class SortingNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// TODO: put your code here
		// 		Hint: "Nested Ifs" means "if" conditions inside the body of other "if" conditions  


		System.out.print("Enter How Many Inputs: ");
		int num1 = Integer.parseInt(in.readLine());
		int arr[] = new int[num1];
		
		for (int i = 0; i<num1; i++) {
			System.out.print("Enter Value #" + (i + 1) + ":");
			arr[i] =Integer.parseInt(in.readLine());
		}
		
		System.out.print("Numbers in Ascending Order:" );
		
		for(int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
			System.out.print( " " +arr[i]);
		}
		
		System.out.println(" ");
		System.out.print("Numbers in Descending Order: " );




	



		
		scanner.close();
	}
}