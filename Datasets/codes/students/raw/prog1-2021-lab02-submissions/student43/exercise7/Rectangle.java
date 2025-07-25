package lu.uni.programming1.lab2.exercise7;

import java.util.Scanner;

/**
 *  Class for Exercise 7
 */
public class Rectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("X coordinates for the point: ");
		int pointx = scanner.nextInt();
		System.out.print("Y coordinates for the point: ");
		int pointy = scanner.nextInt();
		System.out.print("X coordinates for the start of the rectangle: ");
		int startx = scanner.nextInt();
		System.out.print("How far does it extend on the X axis: ");
		int extendx = scanner.nextInt();
		int endx = startx + extendx;
		System.out.print("Y coordinates for the start of the rectangle: ");
		int starty = scanner.nextInt();
		System.out.print("How far does it extend on the Y axis: ");
		int extendy = scanner.nextInt();
		int endy = starty + extendy;
		//asks what coordinates the point is at, what points the square starts at and how far they extend.
		if ((pointx > startx) && (pointx < endx)){
			if ((pointy > starty) && (pointy < endy)){
				System.out.println("The point is in the rectangle");}
			else System.out.println("The point is not in the rectangle");}
			else System.out.println("The point is not in the rectangle");
		//checks if the point fits within the X and Y values of the square, otherwise recognizes the point is not in the square
		// TODO: put your code here
		
		scanner.close();
	}
}