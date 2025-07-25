import java.util.Scanner;

import javax.naming.LimitExceededException;

public class Speedlimit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter road type id: ");

		int roadTypeId = scanner.nextInt();
		


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


		
		scanner.close();
	}
}