package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 *  Class for Exercise 5.2
 */
public class SortingNotNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insert a first number: ");
		int one = scanner.nextInt();
		System.out.print("Insert a second number: ");
		int two = scanner.nextInt();
		System.out.print("Insert a third number: ");
		int three = scanner.nextInt();
		//accepts number inputs
		// TODO: put your code here
		
		if ((one < two) && (one < three) && (two < three)){
			System.out.println("Sorted order; "+one+" , "+two+" , "+three);}
		if ((one < two) && (one < three) && (two > three)){
			System.out.println("Sorted order; "+one+" , "+three+" , "+two);}
		if ((one > two) && (two < three) && (one < three)){
			System.out.println("Sorted order; "+two+" , "+one+" , "+three);}
		if ((one > two) && (two > three) && (one > three)){
			System.out.println("Sorted order; "+two+" , "+three+" , "+one);}
		if ((three < two) && (three < one) && (one < two)){
			System.out.println("Sorted order; "+three+" , "+one+" , "+two);}
		if ((three < two) && (three < one) && (two < one)){
			System.out.println("Sorted order; "+three+" , "+two+" , "+one);}
		//checks each different combination of sizes
		scanner.close();
	}
}