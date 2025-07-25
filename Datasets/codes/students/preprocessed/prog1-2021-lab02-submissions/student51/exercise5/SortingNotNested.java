package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 *  Class for Exercise 5.2
 */
public class SortingNotNested {

	public static void main(String[] args) {
		int integer1;
		int integer2;
		int integer3;

		Scanner scanner = new Scanner(System.in);
		
		// TODO: put your code here
		// 		Hint: "Nested Ifs" means "if" conditions inside the body of other "if" conditions  
		System.out.println("Insert first int : ");
		integer1 = scanner.nextInt();
		System.out.println("Insert second int : ");
		integer2 = scanner.nextInt();
		System.out.println("Insert third int : ");
		integer3 = scanner.nextInt();

		if(integer1>integer2)
		{
			int temp = integer1;
			integer1 = integer2;
			integer2 = temp;
		}
		if(integer2>integer3)
		{
			int temp = integer2;
			integer2 = integer3;
			integer3 = temp;
		}

		System.out.println();
		System.out.println(integer1);
		System.out.println(integer2);
		System.out.println(integer3);



		// TODO: put your code here
		
		scanner.close();
	}
}