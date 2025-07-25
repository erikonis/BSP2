package lu.uni.programming1.lab2.exercise7;

import java.util.Scanner;

/**
 *  Class for Exercise 7
 */
public class Rectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Coordinates for the rectangle
		System.out.println("Give coordinates for the rectangle :xmin, xmax, ymin, ymax :");
		double xmin = scanner.nextDouble();
		double xmax = scanner.nextDouble();
		double ymin = scanner.nextDouble();
		double ymax = scanner.nextDouble();

		//Coordinates for the point to check
		System.out.println("Give the coordinates for the point: x and y : ");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();

		// We have to check if it's okay or not
		
		if ((xmin<=x)&&(x<=xmax)&&(ymin<=y)&&(y<=ymax)){
			System.out.println("The point is inside your rectangle.");
		}
			else if ((xmin>x)||(x>xmax)||(ymin>y)||(y>ymax)){
			System.out.println("The point is NOT inside your rectangle.");
		}

		scanner.close();
	}
}