package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 *  Class for Exercise 5.2
 */
public class SortingNotNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1,n2,n3 = 0;
		System.out.println("Please enter n1 : ");
		n1 = scanner.nextInt();
		System.out.println("Please enter n1 : ");
		n2 = scanner.nextInt();
		System.out.println("Please enter n1 : ");
		n3 = scanner.nextInt();
		if(n1 > n2 && n1 > n3){
			System.out.println(Math.min(n2, n3)+" < "+Math.max(n2, n3)+" < "+n1);
		}
		else if(n2 > n1 && n2 > n3){
			System.out.println(Math.min(n1, n3)+" < "+Math.max(n1, n3)+" < "+n2);
		}
		else{
			System.out.println(Math.min(n1, n2)+" < "+Math.max(n1, n2)+" < "+n3);
		}
		scanner.close();
	}
}