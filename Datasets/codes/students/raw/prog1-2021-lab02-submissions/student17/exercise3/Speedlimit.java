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

		//TODO: Extend the code here to read the current speed etc.
		//		Hint: You can reuse the existing Scanner to 
		//            read the speed as well
		//      Hint: Scanner has a method called nextDouble()
		//		      to read double valued if you wish to do so
		System.out.print("Please enter driver speed: ");
		int driverSpeed= scanner.nextInt();

		String roadType;
		int excess=0;
		int speedLimit=0;

		switch(roadTypeId)
		{
			case 1:
				roadType = "motorway";
				if(driverSpeed<=130)
				{
					System.out.println("Speed OK for " + roadType + " road.");
				}
				else
				{
					excess = driverSpeed-130;
					System.out.println("Too fast for " + roadType + " road. " + excess + " over the limit!");
				}
				speedLimit=130;
				break;
			case 2:
				roadType = "ordinary";
				if(driverSpeed<=90)
				{
					System.out.println("Speed OK for " + roadType + " road.");
				}
				else
				{
					excess = driverSpeed-90;
					System.out.println("Too fast for " + roadType + " road. " + excess + " over the limit!");
				}
				speedLimit=90;
				break;
			case 3:
				roadType = "town";
				if(driverSpeed<=50)
				{
					System.out.println("Speed OK for " + roadType + " road.");
				}
				else
				{
					excess = driverSpeed-50;
					System.out.println("Too fast for " + roadType + " road. " + excess + " over the limit!");
				}
				speedLimit=50;
				break;
			case 4:
				roadType = "calmed";
				if(driverSpeed<=30)
				{
					System.out.println("Speed OK for " + roadType + " road.");
				}
				else
				{
					excess = driverSpeed-30;
					System.out.println("Too fast for " + roadType + " road. " + excess + " over the limit!");
				}
				speedLimit=30;
				break;
			default:
				System.out.println("Unknown road type: " + roadTypeId);
				break;
		}

		// TODO: Ex3.2 - Extend your code to calculate and print the fine
		if(excess<=speedLimit*5/100)
		{
			System.out.println("fine : 0€");
		}
		else if(excess<=speedLimit*30/100)
		{
			System.out.println("fine : 50€");
		}
		else if(excess<=speedLimit*50/100)
		{
			System.out.println("fine : 150€");
		}
		else
		{
			System.out.println("fine : 500€");
		}
		
		// Streams should be closed - More details in a later class
		scanner.close();
	}
}