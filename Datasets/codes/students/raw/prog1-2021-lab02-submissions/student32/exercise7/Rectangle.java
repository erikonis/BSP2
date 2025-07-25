package lu.uni.programming1.lab2.exercise7;

import java.util.Scanner;

/**
 *  Class for Exercise 7
 */
public class Rectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here

		//coordinates of the point
		System.out.print("Please enter the x coordinate of the point: ");
		double xp = scanner.nextDouble();

		System.out.print("Please enter the y coordinate of the point: ");
		double yp = scanner.nextDouble();

		//coordinates of the rectangle
		System.out.print("Please enter the minimum x coordinate of the point: ");
		double xmin = scanner.nextDouble();

		System.out.print("Please enter the maximum x coordinate of the point: ");
		double xmax = scanner.nextDouble();

		System.out.print("Please enter the minimum y coordinate of the point: ");
		double ymin = scanner.nextDouble();

		System.out.print("Please enter the maximum y coordinate of the point: ");
		double ymax = scanner.nextDouble();

		
		if (xmin > xmax || ymin > ymax) {
			System.out.println("A maximum value is smaller than its minimum value\nThe input is therefore invalid");
		} else if ((xmin <= xp && xp <= xmax) && (ymin <= yp && yp <= ymax)) {
			System.out.println("The point is inside the rectangle");
		} else {
			System.out.println("The point is outside the rectangle");
		}

		scanner.close();
	}
}