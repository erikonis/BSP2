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
		System.out.print("Please enter road type id (numbers from 1-4): ");

		// Reading the road type id from standard input
		int roadTypeId = scanner.nextInt();

		//TODO: Extend the code here to read the current speed etc.
		//		Hint: You can reuse the existing Scanner to 
		//            read the speed as well
		//      Hint: Scanner has a method called nextDouble()
		//		      to read double valued if you wish to do so
		System.out.print("Please enter the speed in km/h: ");
		double speedinput = scanner.nextDouble();
		//read speed input
		Double limit = 0.0;
		String roadtype = "none";
		Double over = 0.0;
		int cost = 0;
		//default values for the other variables
		if (roadTypeId == 1){
			roadtype = "motorway";
			limit = 130.0;}
		if (roadTypeId == 2){
			roadtype = "ordinary";
			limit = 90.0;}
		if (roadTypeId == 3){
			roadtype = "town";
			limit = 50.0;}
		if (roadTypeId == 4){
			roadtype = "calmed";
			limit = 30.0;}
			//reads the road type from the input, and sets the speed limit and name accordingly

		if ((limit < speedinput) && (roadTypeId > 0) && (roadTypeId < 4)){
		over = speedinput - limit;
		System.out.println("Too fast for "+roadtype+" road.");
		System.out.println(over+" km/h over the limit");}
		//checks if the road type ID is valid and if the speed is higher than the limit, then calculates how much it's over the limit
		if ((limit >= speedinput) && (roadTypeId > 0) && (roadTypeId < 4)){
		over = speedinput - limit;
		System.out.println("Speed OK for " +roadtype+ " road.");}
		//checks if the ID is valid and if the speed is below or equal to the limit
		if ((roadTypeId <= 0) || (roadTypeId > 4)){
			System.out.println("Unknown road type: "+roadTypeId);}
			//if the ID is not valid

		// TODO: Ex3.2 - Extend your code to calculate and print the fine
		if (over > 0.0){
			double excessvalue = (over / limit)*100;
			if ((excessvalue > 0.0) && (excessvalue <= 5.0)){
				cost = 0;}
			if ((excessvalue > 5.0) && (excessvalue <= 30.0)){
				cost = 50;}
			if ((excessvalue > 30.0) && (excessvalue <= 50.0)){
				cost = 150;}
			if (excessvalue > 50.0){
				cost = 500;}
			// if the value for being over the limit is not 0, it calculates the percentage it's over and assigns your fine accordingly
			System.out.println("You were "+excessvalue+"% over the speed limit");
			System.out.println("You are fined "+cost+"€ for it");}
		
		// Streams should be closed - More details in a later class
		scanner.close();
	}
}