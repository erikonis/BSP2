package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter road type id: ");
		System.out.println("1 for Motorway road / 2 for Ordinary road / 3 for Town road / 4 for Calmed road");
		
		int roadTypeId = scanner.nextInt();

		System.out.println("Please enter roadspeed (km/h): ");

		double roadSpeed = scanner.nextDouble();
		roadSpeed = Math.max(roadSpeed, 0);

		if (roadTypeId == 1) {
			if (roadSpeed > 130.0) {
				
				double excessM = roadSpeed - 130.0;
				System.out.println("Too fast for Motorway road. " + excessM + " km/h over the limit !");

				if (excessM <= 130 / 100 * 5) {System.out.println("Fine = 0€");}
				else if (excessM <= 130 / 100 * 30) {System.out.println("Fine = 50€");}
				else if (excessM <= 130 / 100 * 50) {System.out.println("Fine = 150€");}
				else if (excessM > 130 / 100 * 50) {System.out.println("Fine = 500€");}}
			else if (roadSpeed <= 130) {System.out.println("Speed okay for Motorway road.");}
		}


		else if (roadTypeId == 2) {
			if (roadSpeed > 90.0) {

				double excesso = roadSpeed - 90.0;
				System.out.println("Too fast for Ordinary road. " + excesso + " km/h over the limit !");
				if (excesso <= 90.0 / 100.0 * 5.0) {System.out.println("Fine = 0€");}
				else if (excesso <= 90.0 / 100.0 * 30.0) {System.out.println("Fine = 50€");}
				else if (excesso <= 90.0 / 100.0 * 50.0) {System.out.println("Fine = 150€");}
				else if (excesso > 90.0 / 100.0 * 50.0) {System.out.println("Fine = 500€");}}
			else if (roadSpeed <= 90.0) {System.out.println("Speed okay for Ordinary road.");}
		}


		else if (roadTypeId == 3) {
			if (roadSpeed > 50.0) {

				double excessT = roadSpeed - 50.0;
				System.out.println("Too fast for Town road. " + excessT + " km/h over the limit !");
				if (excessT <= 50.0 / 100.0 * 5.0) {System.out.println("Fine = 0€");}
				else if (excessT <= 50.0 / 100.0 * 30.0) {System.out.println("Fine = 50€");}
				else if (excessT <= 50.0 / 100.0 * 50.0) {System.out.println("Fine = 150€");}
				else if (excessT > 50.0 / 100.0 * 50.0) {System.out.println("Fine = 500€");}}
			else if (roadSpeed <= 50.0) {System.out.println("Speed okay for Town road.");}
		}


		else if (roadTypeId == 4) {
			if (roadSpeed > 30.0) {

				double excessC = roadSpeed - 30.0;
				System.out.println("Too fast for Calmed road. " + excessC + " km/h over the limit !");
				if (excessC <= 30.0 / 100.0 * 5.0) {System.out.println("Fine = 0€");}
				else if (excessC <= 30.0 / 100.0 * 30.0) {System.out.println("Fine = 50€");}
				else if (excessC <= 30.0 / 100.0 * 50.0) {System.out.println("Fine = 150€");}
				else if (excessC > 30.0 / 100.0 * 50.0) {System.out.println("Fine = 500€");}}
			else if (roadSpeed <= 30.0) {System.out.println("Speed okay for Calmed road.");}
		}
		
		
		else {System.out.println("Unknown road type: " + roadTypeId);}

	
		scanner.close();
	}
}