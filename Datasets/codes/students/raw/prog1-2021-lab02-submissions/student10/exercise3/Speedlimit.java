
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
		String roadType = ""+roadTypeId;
		double speedLimit=0;

		if(roadTypeId==1){
			roadType="motorway";
			speedLimit=130;
		}
		else if(roadTypeId==2){
			roadType="ordinary";
			speedLimit=90;
		}
		else if(roadTypeId==3){
			roadType="town";
			speedLimit=50;
		}
		else if(roadTypeId==4){
			roadType="calmed";
			speedLimit=30;
		}

		//TODO: Extend the code here to read the current speed etc.
		//		Hint: You can reuse the existing Scanner to 
		//            read the speed as well
		//      Hint: Scanner has a method called nextDouble()
		//		      to read double valued if you wish to do so

		System.out.print("Please enter your current speed: ");
		double speed = scanner.nextDouble();

		double speedDif=speed-speedLimit;
		
		if(speedDif==speed)
			System.out.println("Unknown roadtype : "+roadType);
		else if(speedDif>0){
			System.out.println("Too fast for "+roadType+" road. "+speedDif+" km/h over the limit");

			// TODO: Ex3.2 - Extend your code to calculate and print the fine

			double excessRange = speed/speedLimit-1;
			
			if(excessRange<=0.05)
				System.out.println("Your fine got discarded");
			else if(excessRange<=0.3)
				System.out.println("Your fine is 50 euro");
			else if(excessRange<=0.5)
				System.out.println("Your fine is 150 euro");
			else
				System.out.println("Your fine is 500 euro");
		}
		else if(speedDif<=0)
			System.out.println("speed OKAY for "+roadType+" road");

		
		// Streams should be closed - More details in a later class
		scanner.close();
	}
}