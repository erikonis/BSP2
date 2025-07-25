package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 *  Class for Exercise 5.1
 */
public class SortingNested {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("a= ");
		a= scanner.nextInt();
		System.out.print("b= ");
		b= scanner.nextInt();
		System.out.print("c= ");
		c= scanner.nextInt();

		if(a>b)
			if(b>c)
			System.out.println(c+"<"+b+ "<"+ a );
			else if (a>c)
			System.out.println(b+"<"+c+ "<"+ a );
			else 
			System.out.println(b+"<"+a+ "<"+ c );
		else if(b>a)
			if(a>c)
			System.out.println(c+"<"+a+ "<"+ b );
			else if (b>c)
			System.out.println(a+"<"+c+ "<"+ b );
			else 
			System.out.println(a+"<"+b+ "<"+ c );

	
		
		scanner.close();
	}
}