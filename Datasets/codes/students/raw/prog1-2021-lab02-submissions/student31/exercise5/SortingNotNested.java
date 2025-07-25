package lu.uni.programming1.lab2.exercise5;

import java.util.Scanner;

/**
 *  Class for Exercise 5.2
 */
public class SortingNotNested {

	public static void print_ascending_order(int num1, int num2, int num3)
		 			
			{
				
				int get_max = Math.max(num1, Math.max(num2, num3)); // Find maximum element
			 
			  
				int get_min = -Math.max(-num1, Math.max(-num2, -num3));  // Find minimum element
			 
				int get_mid = (num1 + num2 + num3)
							  - (get_max + get_min);
			 
				System.out.println(get_min + " " + get_mid
										+ " " + get_max);
			}
			 
			public static void main(String[] args)
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter three integers: ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				int num3 = sc.nextInt();
				print_ascending_order(num1, num2, num3);
			}
		}
		
		
	




		
