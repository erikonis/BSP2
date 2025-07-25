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

		System.out.println("enter your speed: ");
		double speed = scanner.nextDouble();

     if (roadTypeId == 1) {
	    if (speed <= 130 )
	 System.out.println("Speed OK for motorway road " );
	 else
	   System.out.println("Too fast for motorway road " + (speed - 130) + " over the limit!");
	   //calculating and printing the fine.
	   
	   
	    if ( (speed - 130)/130 <= 0.05 && ((speed - 130)/130) >= 0 )
	   System.out.println("your fine is : 0");
	    if ((speed - 130)/130 <= 0.30  && ((speed - 130)/130) > 0.05)
	   System.out.println("your fine is : 50");
	    if ( (speed - 130)/130 <= 0.50 && ((speed - 130)/130) > 0.30)
		System.out.println("your fine is : 150");
		if ((speed - 130)/130 > 0.5)
		System.out.println("your fine is 500");
         } 
	  if (roadTypeId == 2) { 
	      if (speed <= 90 )
	   System.out.println("Speed Ok for ordinary road. ");
	   else
	   System.out.println("Too fast for ordinary road. " + (speed - 90) + " over the limit!");
	   // the fine


	   if ( (speed - 90)/90 <= 0.05 && ((speed - 90)/90) >= 0 )
	   System.out.println("your fine is : 0");
	    if ((speed - 90)/90 <= 0.30  && ((speed - 90)/90) > 0.05)
	   System.out.println("your fine is : 50");
	    if ( (speed - 90)/90<= 0.50 && ((speed - 90)/90) > 0.30)
		System.out.println("your fine is : 150");
		if ((speed - 90)/90 > 0.5)
		System.out.println("your fine is 500");
         }
	   if (roadTypeId == 3 ) {
	     if (speed <= 50)
		 System.out.println("Speed OK for town road. ");
		  else
		   System.out.println("Too fast for town road. " + (speed - 50) + " over the limit!");
		   //fine


		   if ( (speed - 50)/50 <= 0.05 && ((speed - 50)/50) >= 0)
		   System.out.println("your fine is : 0");
			if ((speed - 50)/50 <= 0.30  && ((speed - 50)/50) > 0.05)
		   System.out.println("your fine is : 50");
			if ( (speed - 50)/50 <= 0.50 && ((speed - 50)/50) > 0.30)
			System.out.println("your fine is : 150");
			if ((speed - 50)/50 > 0.5 )
			   System.out.println("your fine is 500");
		}
	   if (roadTypeId == 4) {
		  if (speed <= 30)
			 System.out.println( "Speed Ok for calmed road. ");
		 else
			 System.out.println("Too fast for calmed road " + (speed - 30) + " over the limit1");
			 //fine

			 
			 if ( (speed - 30)/30 <= 0.05 && ((speed - 30)/30) >= 0 )
			 System.out.println("your fine is : 0");
			  if ((speed - 30)/30 <= 0.30  && ((speed - 30)/30) > 0.05)
			 System.out.println("your fine is : 50");
			  if ( (speed - 30)/30<= 0.50 && ((speed - 30)/30) > 0.30)
			  System.out.println("your fine is : 150");
			  if ((speed - 30)/30 > 0.5)
			  System.out.println("your fine is 500");
			}
			 if (roadTypeId > 4 || roadTypeId < 1 ) {
			 System.out.println("Unknown road type " + roadTypeId);
			} 
		// Streams should be closed - More details in a later class
		scanner.close();
	}
 }