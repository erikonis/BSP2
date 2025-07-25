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

		System.out.println("Please enter the travelling speed: ");
		double speed = scanner.nextDouble();
	
			switch(roadTypeId){
				case 1: if (speed > 130){System.out.println("Too fast for motorway road. " + (speed-130) + " over the limit!");}
						else {System.out.println("Speed OK for motorway road.");}
				break;
				
				case 2: if (speed > 90){System.out.println("Too fast for ordinary road. " + (speed-90) + " over the limit!");}
						else {System.out.println("Speed OK for ordinary road.");}
				break;

				case 3: if (speed > 50){System.out.println("Too fast for town road. " + (speed-50) + " over the limit!");}
						else {System.out.println("Speed OK for town road.");}
				break;

				case 4: if (speed > 30){System.out.println("Too fast for calmed road. " + (speed-30) + " over the limit!");}
						else {System.out.println("Speed OK for calmed road.");}
				break;

				default: System.out.println("Unknown road type: " + roadTypeId);
			}


		// TODO: Ex3.2 - Extend your code to calculate and print the fine

			
			double excess = 0.0;
			switch(roadTypeId){
				case 1: if (speed>130){
					excess = ((speed-130)/130)*100; 
				}
				break;

				case 2: if (speed>90){
					excess = ((speed-90)/90)*100;
				}
				break;

				case 3: if (speed>50){
					excess = ((speed-50)/50)*100;
				}
				break;

				case 4: if (speed>30){
					excess = ((speed-30)/30)*100;
				}
				break;
				default: excess = 0;

			}
			//System.out.println(excess);
			if (excess > 0 && excess <= 5 ){System.out.println("The fine will be 0€");}
			else if (excess > 5 && excess <= 30 ){System.out.println("The fine will be 50€");}
			else if (excess > 30 && excess <= 50 ){System.out.println("The fine will be 150€");}
			else if (excess > 50){System.out.println("The fine will be 500€");}
			else {System.out.println("No fine necessary");}
		// Streams should be closed - More details in a later class
		scanner.close();
	}
}