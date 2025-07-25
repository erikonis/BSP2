package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

import javax.naming.LimitExceededException;

/**
 *  Class for Exercises 3.1 and 3.2
 */
public class Speedlimit {

	public static void main(String[] args) {
		// Ex3.1 - Put your speedlimit checking code here
		//         	Hint: We use a "Scanner" as seen in
		//			Exercise3 of Lab01 "Reading User Input"
		// 	        to read from standard input
		Scanner scanner = new Scanner(System.in);
		
		// Asking the user to enter the road type id
		System.out.print("Please enter road type id: ");

		// Reading the road type id from standard input
		int roadTypeId = scanner.nextInt();
		


		//TODO: Extend the code here to read the current speed etc.
		//		Hint: You can reuse the existing Scanner to 
		//            read the speed as well
		//      Hint: Scanner has a method called nextDouble()
		//		      to read double valued if you wish to do so
		if (roadTypeId == 1 && scanner.hasNextDouble()){

			double speedlimite = scanner.nextDouble();

			if (speedlimite > 130){
			System.out.println("Too fast for motorway road. " + (speedlimite - 130
			) + " over the limit!");
			double speeddiff = ((speedlimite - 130)*100)/speedlimite;

			if (speeddiff <= 5){
			System.out.println("The fine will be 0€.");
			}

			else if (speeddiff <= 30){
			System.out.println("The fine will be 50€.");
			}

			else if (speeddiff <= 50){
			System.out.println("The fine will be 150€.");
			}

			else if(speeddiff > 50){
				System.out.println("The fine will be 500.");
			}

			}
			

			else {
			System.out.println("Speed OK for motorway road.");
			}

		}

		else if (roadTypeId == 2 && scanner.hasNextDouble()){

			double speedlimite = scanner.nextDouble();

		if (speedlimite > 90){
			System.out.println("Too fast for ordinary road. " + (speedlimite - 90
			) + " over the limit!");

			double speeddiff = ((speedlimite - 90)*100)/speedlimite;

			if (speeddiff <= 5){
			System.out.println("The fine will be 0€.");
			}

			else if (speeddiff <= 30){
			System.out.println("The fine will be 50€.");
			}

			else if (speeddiff <= 50){
			System.out.println("The fine will be 150€.");
			}

			else if(speeddiff > 50){
				System.out.println("The fine will be 500€.");
			}

			}

		else {
			System.out.println("Speed OK for ordinary road.");
			}
		}

		else if (roadTypeId == 3 && scanner.hasNextDouble()){

			double speedlimite = scanner.nextDouble();

			if (speedlimite > 50){
			System.out.println("Too fast for town road. " + (speedlimite - 50
			) + " over the limit!");
			double speeddiff = ((speedlimite - 50)*100)/speedlimite;

			if (speeddiff <= 5){
			System.out.println("The fine will be 0€.");
			}

			else if (speeddiff <= 30){
			System.out.println("The fine will be 50€.");
			}

			else if (speeddiff <= 50){
			System.out.println("The fine will be 150€.");
			}

			else if(speeddiff > 50){
				System.out.println("The fine will be 500€.");
			}

			}

			else {
			System.out.println("Speed OK for town road.");
			}

		}

		else if (roadTypeId == 4 && scanner.hasNextDouble()){

			double speedlimite = scanner.nextDouble();
			if (speedlimite > 30){

			System.out.println("Too fast for calmed road. " + (speedlimite - 30
			) + " over the limit!");
			double speeddiff = ((speedlimite - 30)*100)/speedlimite;

			if (speeddiff <= 5){
			System.out.println("The fine will be 0€.");
			}

			else if (speeddiff <= 30){
			System.out.println("The fine will be 50€.");
			}

			else if (speeddiff <= 50){
			System.out.println("The fine will be 150€.");
			}
			
			else if(speeddiff > 50){
				System.out.println("The fine will be 500€.");
			}
			
			}

			else {
			System.out.println("Speed OK for calmed road.");
			}

		}

		else if (roadTypeId > 4){
			System.out.println("Unknown road type :" + roadTypeId);
		}

		else{
			System.out.println("This is not a numeric value:" + scanner.next());
		}

		// TODO: Ex3.2 - Extend your code to calculate and print the fine

		
		// Streams should be closed - More details in a later class
		scanner.close();
	}
}