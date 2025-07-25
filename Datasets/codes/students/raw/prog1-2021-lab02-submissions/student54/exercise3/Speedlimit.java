package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

/**
 *  Class for Exercises 3.1 and 3.2
 */
public class Speedlimit {

	public static void main(String[] args) {
		int speedLimit = 0;
		int roadTypeId;
		double speed = 0;
		double excess = 0;
		String road = "";
		int fine = 0;

		// Ex3.1 - Put your speedlimit checking code here
		//         	Hint: We use a "Scanner" as seen in
		//			Exercise3 of Lab01 "Reading User Input"
		// 	        to read from standard input
		Scanner scanner = new Scanner(System.in);
		
		// Asking the user to enter the road type id
		System.out.print("Please enter road type id: ");
		

		// Reading the road type id from standard input
		roadTypeId = scanner.nextInt();

		//TODO: Extend the code here to read the current speed etc.
		//		Hint: You can reuse the existing Scanner to 
		//            read the speed as well
		//      Hint: Scanner has a method called nextDouble()
		//		      to read double valued if you wish to do so
		System.out.print("Please enter speed: ");
		speed = scanner.nextDouble();

		if(roadTypeId == 1){
			road = "motorway";
			speedLimit = 130;
			excess = speed - speedLimit;
		}else if(roadTypeId == 2){
			road = "ordinary";
			speedLimit = 90;
			excess = speed - speedLimit;
		}else if(roadTypeId == 3){
			road = "town";
			speedLimit = 50;
			excess = speed - speedLimit;
		}else if(roadTypeId == 4){
			road = "calmed";
			speedLimit = 30;
			excess = speed - speedLimit;
		}else{
			System.out.println("Uknown road type : "+roadTypeId);
		}

		if(excess > 0){
			System.out.println("Too fast for "+road+" road. "+excess+" over the limit!");
		}else{
			System.out.println("Speed OK for "+road+" road.");
		}

		
		// TODO: Ex3.2 - Extend your code to calculate and print the fine
		if(excess <= 0.05*speedLimit){
			fine = 0;
		}else if(excess <= 0.3*speedLimit ){
			fine = 50;
		}else if(excess <= 0.5*speedLimit){
			fine = 150;
		}else{
			fine = 500;
		}

		if(fine > 0){
			System.out.println("The fine is "+fine+" EUR.");
		}
		
		// Streams should be closed - More details in a later class
		scanner.close();
	}
}