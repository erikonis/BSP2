package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

//import jdk.javadoc.internal.doclets.toolkit.taglets.SystemPropertyTaglet;

/**
 *  Class for Exercises 3.1 and 3.2
 */
public class Speedlimit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Asking the user to enter the road type id
		System.out.print("Please enter road type id: ");
		int roadTypeId = scanner.nextInt();

		System.out.println("Pease enter the driver speed");
		double driverSpeed = scanner.nextDouble();

		String selectedRoadType = "";
		int maxSpeedLimit = 0;

		if (roadTypeId >= 1 && roadTypeId <= 4){
			if (roadTypeId == 1) {
				selectedRoadType = "motorway";
				maxSpeedLimit = 130;

			} else if (roadTypeId == 2){
				selectedRoadType = "ordinary";
				maxSpeedLimit = 90;

			}else if (roadTypeId == 3){
				selectedRoadType = "town";
				maxSpeedLimit = 50;

			}else if (roadTypeId == 4){
				selectedRoadType = "calmed";
				maxSpeedLimit = 30;
			}
			// Output
			if (driverSpeed <= maxSpeedLimit){
				System.out.format("Speed OK for %s road.", selectedRoadType);
			}else{
				System.out.format("Too fast for %s road. %.2f over the limit!", selectedRoadType, driverSpeed - maxSpeedLimit);

				//Calculate fine
				double excessPercent = (100 * driverSpeed)/maxSpeedLimit - 100;

				int fine = 0;

				//Check fine
				if (excessPercent >5 && excessPercent <= 30){fine = 50;}
				else if (excessPercent > 30 && excessPercent <= 50) {fine = 150;}
				else if (excessPercent > 50) {fine = 500;}

				System.out.format("\nThe driver would be fined %d€", fine);
			}

		}else{
			System.out.format("Unknown road type: %d", roadTypeId);
		}

		

		
		// Streams should be closed - More details in a later class
		scanner.close();
	}
}