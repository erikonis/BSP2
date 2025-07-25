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
		double excess = 0;
		double excessPercentage=0;
		Scanner scanner = new Scanner(System.in);
		boolean finable = false;
		
		// Asking the user to enter the road type id
		System.out.print("Please enter road type id: ");

		// Reading the road type id from standard input
		int roadTypeId = scanner.nextInt();

		//TODO: Extend the code here to read the current speed etc.
		//		Hint: You can reuse the existing Scanner to 
		//            read the speed as well
		//      Hint: Scanner has a method called nextDouble()
		//		      to read double valued if you wish to do so

		System.out.print("Please enter the driver speed: ");
		double travelingSpeed = scanner.nextDouble();

		
		if(roadTypeId==1) //motorway
		{
			if(travelingSpeed>130) 
			{
				excess = travelingSpeed-130; System.out.println("Too fast for motorway road. "+(excess)+" over the limit!");
				excessPercentage = 100 * excess / 130;
				finable = true;
			}
			else 
			{
				System.out.println("Speed OK for motorway road.");
				finable = false;
			}
			

		}
		else if(roadTypeId==2) //ordinary
		{
			if(travelingSpeed>90) 
			{
				excess = travelingSpeed-90; System.out.println("Too fast for ordinary road. "+(excess)+" over the limit!");
				excessPercentage = 100 * excess / 50;
				finable = true;
			}
			else 
			{
				System.out.println("Speed OK for motorway road.");
				finable = false;
			}
			excessPercentage = 100 * excess / 90;
		}
		else if(roadTypeId==3) //town
		{
			if(travelingSpeed>50)
			{
				excess = travelingSpeed-50; System.out.println("Too fast for town road. "+(excess)+" over the limit!");
				excessPercentage = 100 * excess / 50;
				finable = true;
			}
			else 
			{
				System.out.println("Speed OK for motorway road.");
				finable = false;
			}
			
		}
		else if(roadTypeId==4) //calmed
		{
			if(travelingSpeed>30) 
			{
				excess = travelingSpeed-30; System.out.println("Too fast for calmed road. "+(excess)+" over the limit!");
				excessPercentage = 100 * excess / 30;
				finable = true;
			}
			else 
			{
				System.out.println("Speed OK for motorway road.");
				finable = false;
			}
				
		}
		else System.out.println("Unknown road type: "+roadTypeId);
		
	int fine = 0;

	if(finable)
	{
		if(0<=excessPercentage&&excessPercentage<=5) fine = 0;
		if(5<excessPercentage&&excessPercentage<=30) fine = 50;
		if(30<excessPercentage&&excessPercentage<=50) fine = 150;
		if(50<excessPercentage) fine = 500;
	
		System.out.println("The fine will be : "+fine+"€");
	}

		// TODO: Ex3.2 - Extend your code to calculate and print the fine

		// Streams should be closed - More details in a later class
		scanner.close();
	}
}