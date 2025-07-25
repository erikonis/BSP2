package lu.uni.programming1.lab2.exercise7;

import java.util.Scanner;

/**
 *  Class for Exercise 7
 */
public class Rectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Coordinates of bottom left corner
		System.out.println("Enter coordinates of the bottom left corner of the rectangle:");
		System.out.println("x1:");
		int x1 = scanner.nextInt();
		System.out.println("y1:");
		int y1 = scanner.nextInt();

		// Coordinates of top right corner
		System.out.println("Now enter coordinates of the top right corner of the rectangle:");
		System.out.println("x2:");
		int x2 = scanner.nextInt();
		System.out.println("y2:");
		int y2 = scanner.nextInt();

		// Coordinates of point
		System.out.println("Finally enter coordinates of the point you want to check:");
		System.out.println("x:");
		int x = scanner.nextInt();
		System.out.println("y:");
		int y = scanner.nextInt();

		// Checks if point is in rectangle
		if (x > x1 && x < x2 && y > y1 && y < y2){
			System.out.println("Point lies inside the rectangle");
		}
		else{
			System.out.println("Point doesn't lie inside the rectangle");
		}

		scanner.close();
	}
}
