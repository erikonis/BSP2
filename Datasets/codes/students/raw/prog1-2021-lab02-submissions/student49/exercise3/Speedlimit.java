package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

/**
 *  Class for Exercises 3.1 and 3.2
 */
public class Speedlimit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter road type id: ");
		int roadTypeId = scanner.nextInt();

		System.out.print("Please enter drivers traveling speed: ");
		double speed = scanner.nextDouble();
		
		scanner.close();

		if (roadTypeId == 1) {
			if (speed > 130.0) {
				System.out.format("Too fast for motorway road. %.2f over the limit!\n", speed - 130.0);
			} else {
				System.out.println("Speed OK for motorway road.");
			}
		} else if (roadTypeId == 2) {
			if (speed > 90.0) {
				System.out.format("Too fast for ordinary road. %.2f over the limit!\n", speed - 90.0);
			} else {
				System.out.println("Speed OK for ordinary road.");
			}
		} else if (roadTypeId == 3) {
			if (speed > 50.0) {
				System.out.format("Too fast for town road. %.2f over the limit!\n", speed - 50.0);
			} else {
				System.out.println("Speed OK for town road.");
			}
		} else if (roadTypeId == 4) {
			if (speed > 30.0) {
				System.out.format("Too fast for calmed road. %.2f over the limit!\n", speed - 30.0);
			} else {
				System.out.println("Speed OK for calmed road.");
			}
		} else {
			System.out.println("Unknown road type: " + roadTypeId);
			return; // return exits a function or in this case the program
		}

		//Ex3.2
		double allowedSpeed;
		if (roadTypeId == 1) {
			allowedSpeed = 130;
		} else if (roadTypeId == 2) {
			allowedSpeed = 90;
		} else if (roadTypeId == 3) {
			allowedSpeed = 50;
		} else {
			allowedSpeed = 30;
		}

		double excess = (speed - allowedSpeed) / allowedSpeed;
		double fine;
		if (excess < 0.05){
			fine = 0;
		} else if (excess < 0.3){
			fine = 50;
		} else if (excess < 0.5){
			fine = 150;
		} else {
			fine = 500;
		}

		System.out.format("The driver receives a fine over %f Euros!\n", fine);

	}
}