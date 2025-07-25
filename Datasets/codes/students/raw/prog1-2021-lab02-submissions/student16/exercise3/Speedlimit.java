package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

/**
 *  Class for Exercises 3.1 and 3.2
 */
public class Speedlimit {

	public static void main(String[] args) {
		double speed = 0;
		double excess = 0;
		String roadtypes = "motorway,ordinary,town,calmed";
		String[] roadtype = roadtypes.split(",");
		int[] speedlimit = {130, 90, 50, 30};
		int[] fine = {0, 50, 150, 500};
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

        if (roadTypeId==1||roadTypeId==2||roadTypeId==3||roadTypeId==4){
			System.out.print("Please enter the speed: ");
		    speed = scanner.nextDouble();
        }else {
			System.out.println("Unknown road type: " + roadTypeId);
			System.out.print("Please enter a valid road type id: ");
			roadTypeId = scanner.nextInt();
		}
		if (speed>speedlimit[roadTypeId-1]){
			excess = speed - speedlimit[roadTypeId-1];
			System.out.println("Too fast for " + roadtype[roadTypeId-1] + " road. \n" + excess + " over the limit!");
		}else {
			System.out.println("Speed OK for " + roadtype[roadTypeId-1] + "road.");
		}
		



		// TODO: Ex3.2 - Extend your code to calculate and print the fine

		if (excess!=0){
			double excess_range = (excess / (speedlimit[roadTypeId-1]) )* 100;
			if (excess_range<=5){
				System.out.println("The fine is about " + fine[0]+".");
			}else if(excess_range>5 && excess_range<=30){
				System.out.println("The fine is about " + fine[1]+".");
			}else if(excess_range>30 && excess_range<=50){
				System.out.println("The fine is about " + fine[2]+".");
			}else{
				System.out.println("The is fine about " + fine[3]+".");
			}
		}
		// Streams should be closed - More details in a later class
		scanner.close();
	}
}