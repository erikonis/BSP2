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
		int roadTypeId;
		String roadType = "";
		int speedCurrentlyDriving;
		int allowed =0;
		int excess =0;
		Scanner scanner = new Scanner(System.in);
		
		// Asking the user to enter the road type id
		System.out.print("Please enter road type id: ");

		// Reading the road type id from standard input
		roadTypeId = scanner.nextInt();

		

		switch(roadTypeId)
		{
			case 1:
			allowed = 130;
			roadType = "motorway";
			break;

			case 2:
			allowed = 90;
			roadType = "ordinary";
			break;

			case 3:
			allowed = 50;
			roadType = "town";
			break;

			case 4:
			allowed = 30;
			roadType = "calmed";
			break;

			default:
			System.out.println("Unknown road type: " + roadTypeId);
			break;
		}


		//TODO: Extend the code here to read the current speed etc.
		//		Hint: You can reuse the existing Scanner to 
		//            read the speed as well
		//      Hint: Scanner has a method called nextDouble()
		//		      to read double valued if you wish to do so
		if(roadTypeId <=4)
		{
			System.out.println("Please enter the speed you are currently driving: ");
			speedCurrentlyDriving = scanner.nextInt();
			excess = speedCurrentlyDriving - allowed;

			if(excess <0)
			{
				System.out.println("Speed OK for " + roadType + " road.");
			}
			else if(excess >0)
			{
				System.out.println("Too fast for " + roadType + " road. " 
				+ excess + " over the limit!");
			}
		}


		// TODO: Ex3.2 - Extend your code to calculate and print the fine

		if(roadTypeId <=4)
		{
			double percentage = ((double)excess/allowed)*100;

			if(percentage <5)
			{
				System.out.println("Your fine is 0 Euro");
			}
			else if(percentage <30)
			{
				System.out.println("Your fine is 50 Euro");
			}
			else if(percentage <50)
			{
				System.out.println("Your fine is 150 Euro");
			}
			else
			{
				System.out.println("Your fine is 500 Euro");
			}
		}
		
		// Streams should be closed - More details in a later class
		scanner.close();
	}
}