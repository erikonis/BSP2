package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 *  Class for Exercise 5.2
 */
public class SortingNotNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.print("a= ");
		a= scanner.nextInt();
		System.out.print("b= ");
		b= scanner.nextInt();
		System.out.print("c= ");
		c= scanner.nextInt();

		int max= (a+b+Math.abs(a-b))/2;
		max= (max+c+Math.abs(max-c))/2;

		int min= (a+b-Math.abs(a-b))/2;
		min = (min+c-Math.abs(min-c))/2;

		int med= a+b+c- min-max;

		System.out.println(min+"<"+med+"<"+max);
		
		
		scanner.close();
	}
}