package lu.uni.programming1.lab2.exercise3;

import java.util.*;

/**
 *  Class for Exercises 3.1 and 3.2
 */
public class Speedlimit {
	public static void main(String[] args) {
		// Initialization of Scanner Object and lists with different roads and their limits
		String[] road = {"motorway", "ordinary", "town", "calmed"};
		double[] speedLimit = {130, 90, 50, 30};
		double range = 0;
		Scanner scanner = new Scanner(System.in);
		
		// Asking the user to enter the road type id
		System.out.print("Please enter road type id (1-4): ");

		// Reading the road type id from standard input
		int roadTypeId = scanner.nextInt();
		// Checks for valid road type id
		while(roadTypeId < 1 || roadTypeId > 4){
			System.out.println("Unknown road type: " + roadTypeId);
			roadTypeId = scanner.nextInt();
		}

		// Reading the speed from standard input
		System.out.println("Now enter the traveling speed (> 0): ");
		double speed = scanner.nextDouble();
		// Checks that speed is not negative
		while(speed < 0){
			System.out.println("Negative speed is not allowed. Please enter the right speed: ");
			speed = scanner.nextDouble();
		}
		// Calculates the speed excess
		double excess = speed - speedLimit[roadTypeId-1];

		// Checks if speed exceeds the limit from the given roadTypeId and outputs the fine
        if(speed <= speedLimit[roadTypeId-1]){
            System.out.println("Speed OK for " + road[roadTypeId-1] + " road.");
        }
        else{
            System.out.println("Too fast for " + road[roadTypeId-1] + " road. " + excess + " over the limit!");
            range = Math.abs(excess/speedLimit[roadTypeId-1]);
            if(range<=0.05)
                System.out.println("You're good, no fine for this time.");
            else if(range<=0.3)
                System.out.println("Your fine is 50€! Better ride more slowly next time!");
            else if(range<=0.5)
                System.out.println("Your fine is 150€! Better ride more slowly next time!");
            else
                System.out.println("Your fine is 500€! Better ride more slowly next time!");
        }
		// Streams should be closed - More details in a later class
		scanner.close();
	}
}
