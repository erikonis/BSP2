package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;

public class Kellacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("upper limit:");
		long upperlimit = scanner.nextLong();
		scanner.close();

		//values for n-1 and n-2
		long minus1 = 1;
		long minus2 = 1;
		long current;
		
		//calculation loop till arrive at max limit
		for (long i = 2; i <= upperlimit; i++){
			//calculation
			current = (minus1 -1) + (minus2*2);
			
			//shift everything by 1
			minus2 = minus1;
			minus1 = current;
			System.out.println("k(" + i + ")= " + current);
		}
	}
	
}
