package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class XtoY {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//starting value
		System.out.println("start:");
		double start = scanner.nextDouble ();

		//ending value
		System.out.println("end:");
		double end = scanner.nextDouble ();
		
		//step size value
		System.out.println("steps:");
		double step = scanner.nextDouble ();
		
		//print everything between start and end in defined steps
		for (double i = start; i <= end; i = i + step){
			System.out.println(i);
		}    

		scanner.close();
	}
}