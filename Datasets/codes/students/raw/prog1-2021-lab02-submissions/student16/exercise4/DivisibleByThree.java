package lu.uni.programming1.lab2.exercise4;

import java.util.Scanner;

/**
 *  Class for Exercise 4
 */
public class DivisibleByThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO: put your code here
		System.out.print("Please enter an integer number : ");
		String number = scanner.nextLine();
		if(number.length()>4){
            while(number.length()>4){
               System.out.print("Please enter an integer number that contains a maximum of 4 digits : ");
               String num = scanner.nextLine();
			   number = num;
		    }
	    }
	    if(number.length()<=4){
		   int num = 0;
		   int tab[]=null;
		   tab=new int[number.length()];
	 
		   for (int i = 0; i < tab.length; i++)
		   tab[i]=number.charAt(i)-'0';
		   for (int n : tab){
		      num = num + n;
	        }
	
		   String check = num % 3==0 ?" is divisible by 3." : " is non-divisible by 3.";
			
		   System.out.println("The number "+number+check);
	    }


		scanner.close();
	}
}