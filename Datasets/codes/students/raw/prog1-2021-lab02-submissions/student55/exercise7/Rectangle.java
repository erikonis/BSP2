package lu.uni.programming1.lab2.exercise7;

import java.util.Scanner;

/**
 *  Class for Exercise 7
 */
public class Rectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double xp,yp,xmin,ymin,xmax,ymax;
		System.out.print("Xp=");
		xp=scanner.nextDouble();
		System.out.print("Yp=");
		yp=scanner.nextDouble();

		System.out.print("xmin=");
		xmin=scanner.nextDouble();
		System.out.print("ymin=");

		ymin=scanner.nextDouble();
		System.out.print("xmax=");
		xmax=scanner.nextDouble();
		System.out.print("ymax=");
		ymax=scanner.nextDouble();

		if(xp>=xmin)
			if(xp<=xmax)
				if(yp>=ymin)
					if(yp<=ymax)
						System.out.println("The point is definitely inside the rectangle!");
						else System.out.println("The point is definitely outside the rectangle!");
					else System.out.println("The point is definitely outside the rectangle!");
				else System.out.println("The point is definitely outside the rectangle!");
			else System.out.println("The point is definitely outside the rectangle!");
		scanner.close();
	}
}