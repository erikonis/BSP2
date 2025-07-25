package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 *  Class for Exercise 5.1
 */
public class SortingNested {

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
		
		System.out.println();

		if((integer1<integer2)&&(integer1<integer3)) 
		{
			System.out.println(integer1);	
			if(integer2<integer3) {System.out.println(integer2); System.out.println(integer3);}
			else {System.out.println(integer3); System.out.println(integer2);}
		}
		if((integer2<integer1)&&(integer2<integer3)) 
		{
			System.out.println(integer2);	
			if(integer1<integer3) {System.out.println(integer1); System.out.println(integer3);}
			else {System.out.println(integer3); System.out.println(integer1);}
		}
		if((integer3<integer1)&&(integer3<integer2)) 
		{
			System.out.println(integer3);	
			if(integer1<integer2) {System.out.println(integer1); System.out.println(integer2);}
			else {System.out.println(integer2); System.out.println(integer1);}
		}

		scanner.close();
	}
}