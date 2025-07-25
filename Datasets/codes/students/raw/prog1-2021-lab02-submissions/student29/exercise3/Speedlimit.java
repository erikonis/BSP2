package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

/**
 * Class for Exercises 3.1 and 3.2
 */
public class Speedlimit {

	public static void main(String[] args) {
		int roadTypeId, speedlimit;
		double speed, excess;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter road type id (1 - 4): ");
		roadTypeId = scanner.nextInt();

		System.out.print("Please enter your traveling speed: ");
		speed = Math.max(0, scanner.nextDouble());

		if (roadTypeId == 1) {
			speedlimit = 130;
			if (speed > speedlimit) {
				System.out.println("Too fast for motorway road. " + (speed - speedlimit) + " km/h over the limit");
				excess = (speed/speedlimit)-1;
				if (excess <= 0.05) {
					System.out.println("You will not get a fine.");
				}else if (excess > 0.05 && excess <= 0.3) {
					System.out.println("The fine will be 50 Euros.");
				}else if (excess > 0.3 && excess <= 0.5) {
					System.out.println("The fine will be 150 Euros.");
				}else if (excess > 0.5) {
					System.out.println("The fine will be 500 Euros.");
				}
			} else if (speed <= speedlimit) {
				System.out.println("Speed is OK for motorway road");
			}
		}
		else if (roadTypeId == 2) {
			speedlimit = 90;
			if (speed > speedlimit) {
				System.out.println("Too fast for ordinary road. " + (speed - speedlimit) + " km/h over the limit");
				excess = (speed/speedlimit)-1;
				if (excess <= 0.05) {
					System.out.println("You will not get a fine.");
				}else if (excess > 0.05 && excess <= 0.3) {
					System.out.println("The fine will be 50 Euros.");
				}else if (excess > 0.3 && excess <= 0.5) {
					System.out.println("The fine will be 150 Euros.");
				}else if (excess > 0.5) {
					System.out.println("The fine will be 500 Euros.");
				}
			} else if (speed <= speedlimit) {
				System.out.println("Speed is OK for ordinray road");
			}
		}
		else if (roadTypeId == 3) {
			speedlimit = 50;
			if (speed > speedlimit) {
				System.out.println("Too fast for town road. " + (speed - speedlimit) + " km/h over the limit");
				excess = (speed/speedlimit)-1;
				if (excess <= 0.05) {
					System.out.println("You will not get a fine.");
				}else if (excess > 0.05 && excess <= 0.3) {
					System.out.println("The fine will be 50 Euros.");
				}else if (excess > 0.3 && excess <= 0.5) {
					System.out.println("The fine will be 150 Euros.");
				}else if (excess > 0.5) {
					System.out.println("The fine will be 500 Euros.");
				}
			} else if (speed <= speedlimit) {
				System.out.println("Speed is OK for town road");
			}
		}
		else if (roadTypeId == 4) {
			speedlimit = 30;
			if (speed > speedlimit) {
				System.out.println("Too fast for calmed road. " + (speed - speedlimit) + " km/h over the limit");
				excess = (speed/speedlimit)-1;
				if (excess <= 0.05) {
					System.out.println("You will not get a fine.");
				}else if (excess > 0.05 && excess <= 0.3) {
					System.out.println("The fine will be 50 Euros.");
				}else if (excess > 0.3 && excess <= 0.5) {
					System.out.println("The fine will be 150 Euros.");
				}else if (excess > 0.5) {
					System.out.println("The fine will be 500 Euros.");
				}
			} else if (speed <= speedlimit) {
				System.out.println("Speed is OK for calmed road");
			}
		} 
		else {
			System.out.println("Unknown road type: " + roadTypeId);
		}
		
		scanner.close();
	}
}