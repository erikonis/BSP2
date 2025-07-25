package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

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

		int speedLimit;

		if (roadTypeId == 1) {
			speedLimit = 130;
		} else if (roadTypeId == 2){
			speedLimit = 90;
		} else if (roadTypeId == 3){
			speedLimit = 50;
		} else if (roadTypeId == 4){
			speedLimit = 30;
		} else {
			System.out.println("not a valid roadtype");
			speedLimit = 0;
			System.exit(0);

		}

		System.out.println("Please enter Speed: ");

		int drivingSpeed = scanner.nextInt();

		int fine = 0;

		if (drivingSpeed > speedLimit){
			System.out.println("Too fast!!!");
			if (drivingSpeed > (speedLimit*1.05) & drivingSpeed <= (speedLimit*1.3)){
				fine = 50;
			} else if (drivingSpeed > (speedLimit*1.3) & drivingSpeed <= (speedLimit*1.5)){
				fine = 150;
			} else if (drivingSpeed > (speedLimit*1.5)){
				fine = 500;
			}
		} else {
			System.out.println("all good");
		}

		System.out.println("your fine is " + fine + "€");
		
		// Streams should be closed - More details in a later class
		scanner.close();
	}
}