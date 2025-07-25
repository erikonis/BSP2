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
		int roadType = 0;
		String rightSpeed = "Speed is OK";
		double excess;
		int calmedSpeedLimit = 30;
		int townSpeedLimit = 50;
		int ordinarySpeedLimit = 90;
		int motorwaySpeedLimit = 130;
		double speedPercentage;
		
		// Asking the user to enter the road type id
		System.out.print("Please enter road type id: ");

		// Reading the road type id from standard input
		int roadTypeId = scanner.nextInt();
		
		switch (roadTypeId){
			case 4: 
				System.out.println("the roadtype is calmed");
				roadType += roadTypeId;
				break;
			case 3: 
				System.out.println("the roadtype is town");
				roadType += roadTypeId;
				break;
			case 2: 
				System.out.println("the roadtype is ordianry");
				roadType += roadTypeId;
				break;
			case 1: 
				System.out.println("the roadtype is motorway");
				roadType += roadTypeId;
				break;
			default: 
				System.out.println("invalid answer");
				break;	
		}
		//TODO: Extend the code here to read the current speed etc.
		//		Hint: You can reuse the existing Scanner to 
		//            read the speed as well
		//      Hint: Scanner has a method called nextDouble()
		//		      to read double valued if you wish to do so
		Scanner scan = new Scanner(System.in);

		System.out.println("Please input speed:");

		int speed = scan.nextInt();
		if ((roadType == 4) && (speed < 30)) {
			System.out.println(rightSpeed);
		}
		if ((roadType == 4) && (speed > 30)) {
			excess = speed - calmedSpeedLimit;
			System.out.println("going " + excess + " over the speedlimit");
			speedPercentage = (excess/calmedSpeedLimit) *100;

			if (speedPercentage < 5){
				System.out.println("no fine");
			}
			if ((speedPercentage > 5) && (speedPercentage < 30)){
				System.out.println("fine is 50 eur");
			}
			if ((speedPercentage > 30) && (speedPercentage < 50)){
				System.out.println("fine is 150 eur");
			}
			if ((speedPercentage > 50)) {
				System.out.println("fine is 500 eur");
			}
		}
		if ((roadType == 3) && (speed < 50)) {
			System.out.println(rightSpeed);
		}
		if ((roadType == 3) && (speed > 50)) {
			excess = speed - townSpeedLimit;
			System.out.println("going " + excess + " over the speedlimit");
			speedPercentage = (excess/townSpeedLimit) *100;

			if (speedPercentage < 5){
				System.out.println("no fine");
			}
			if ((speedPercentage > 5) && (speedPercentage < 30)){
				System.out.println("fine is 50 eur");
			}
			if ((speedPercentage > 30) && (speedPercentage < 50)){
				System.out.println("fine is 150 eur");
			}
			if ((speedPercentage > 50)) {
				System.out.println("fine is 500 eur");
			}
		}
		if ((roadType == 2) && (speed < 90)) {
			System.out.println(rightSpeed);
		}
		if ((roadType == 2) && (speed > 90)) {
			excess = speed - ordinarySpeedLimit;
			System.out.println("going " + excess + " over the speedlimit");
			speedPercentage = (excess/ordinarySpeedLimit)*100;

			if (speedPercentage < 5){
				System.out.println("no fine");
			}
			if ((speedPercentage > 5) && (speedPercentage < 30)){
				System.out.println("fine is 50 eur");
			}
			if ((speedPercentage > 30) && (speedPercentage < 50)){
				System.out.println("fine is 150 eur");
			}
			if ((speedPercentage > 50)) {
				System.out.println("fine is 500 eur");
			}
		}
		if ((roadType == 1) && (speed < 130)) {
			System.out.println(rightSpeed);
		}
		if ((roadType == 1) && (speed > 130)) {
			excess = speed - motorwaySpeedLimit;
			System.out.println("going " + excess + " over the speedlimit");
			speedPercentage = (excess/motorwaySpeedLimit)*100;

			if (speedPercentage < 5){
				System.out.println("no fine");
			}
			if ((speedPercentage > 5) && (speedPercentage < 30)){
				System.out.println("fine is 50 eur");
			}
			if ((speedPercentage > 30) && (speedPercentage < 50)){
				System.out.println("fine is 150 eur");
			}
			if ((speedPercentage > 50)) {
				System.out.println("fine is 500 eur");
			}
		}
		// TODO: Ex3.2 - Extend your code to calculate and print the fine
		
		


		// Streams should be closed - More details in a later class
		scanner.close();
		scan.close();
	}
}