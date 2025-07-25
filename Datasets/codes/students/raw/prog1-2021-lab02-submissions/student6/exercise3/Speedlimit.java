package lu.uni.programming1.lab2.exercise3;

import java.util.Scanner;

/**
 * Class for Exercises 3.1 and 3.2
 */
public class Speedlimit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// initialize variables
		float speed1;
		float pre;
		int speedLimit = 0;

		System.out.println("Please type a speed: ");
		speed1 = scanner.nextInt();

		// Asking the user to enter the road type id
		System.out.print("Please enter road type id: ");

		// Reading the road type id from standard input
		int roadTypeId = scanner.nextInt();

		// speed limit 130=================================================130
		if (roadTypeId == 1) {
			speedLimit = 130;
			System.out.println("The speed limit is: " + speedLimit + " your speed is: " + speed1);

			if (speed1 > 130) {
				System.out.println(
						"To fast  for motorway road. " + (speed1 - 130) / 130 * 100 + " % exceed over the limit.");
			}
			pre = (speed1 - 130) / 130 * 100;
			if (pre <= 5) {
				System.out.println("The fine is: 0 Euro");
			} else if (pre > 5 && pre <= 30) {
				System.out.println("The fine is: 50 Euro");
			} else if (pre > 30 && pre <= 50) {
				System.out.println("The fine is: 150 Euro");
			} else if (pre > 50) {
				System.out.println("The fine is: 500 Euro");
			} else {
				System.out.println("speed ok for motorway road.");
			}
		}
		// speed limit 90=================================================90
		else if (roadTypeId == 2) {
			speedLimit = 90;
			System.out.println("The speed limit is: " + speedLimit + " your speed is: " + speed1);

			if (speed1 > 90) {
				System.out.println(
						"To fast  for ordinary road. " + (speed1 - 90) / 90 * 100 + " % exceed over the limit.");
			}
			pre = (speed1 - 90) / 90 * 100;
			if (pre <= 5) {
				System.out.println("The fine is: 0 Euro");
			} else if (pre > 5 && pre <= 30) {
				System.out.println("The fine is: 50 Euro");
			} else if (pre > 30 && pre <= 50) {
				System.out.println("The fine is: 150 Euro");
			} else if (pre > 50) {
				System.out.println("The fine is: 500 Euro");
			} else {
				System.out.println("speed ok for ordinary road.");
			}
		}
		// speed limit 50=================================================50
		else if (roadTypeId == 3) {
			speedLimit = 50;
			System.out.println("The speed limit is: " + speedLimit + " your speed is: " + speed1);

			if (speed1 > 50) {
				System.out.println("To fast  for town road. " + (speed1 - 50) / 50 * 100 + " % exceed over the limit.");
			}
			pre = (speed1 - 50) / 50 * 100;
			if (pre <= 5) {
				System.out.println("The fine is: 0 Euro");
			} else if (pre > 5 && pre <= 30) {
				System.out.println("The fine is: 50 Euro");
			} else if (pre > 30 && pre <= 50) {
				System.out.println("The fine is: 150 Euro");
			} else if (pre > 50) {
				System.out.println("The fine is: 500 Euro");
			} else {
				System.out.println("speed ok for town road.");
			}
		}
		// speed limit 30=================================================30
		else if (roadTypeId == 4) {
			speedLimit = 30;
			System.out.println("The speed limit is: " + speedLimit + " your speed is: " + speed1);

			if (speed1 > 30) {
				System.out
						.println("To fast  for calmed road. " + (speed1 - 30) / 30 * 100 + " % exceed over the limit.");
			}
			pre = (speed1 - 30) / 30 * 100;
			if (pre <= 5) {
				System.out.println("The fine is: 0 Euro");
			} else if (pre > 5 && pre <= 30) {
				System.out.println("The fine is: 50 Euro");
			} else if (pre > 30 && pre <= 50) {
				System.out.println("The fine is: 150 Euro");
			} else if (pre > 50) {
				System.out.println("The fine is: 500 Euro");
			} else {
				System.out.println("speed ok for calmed road.");
			}
		} else {
			System.out.println("Unknown road type id: " + roadTypeId);
		}

		scanner.close();
	}
}