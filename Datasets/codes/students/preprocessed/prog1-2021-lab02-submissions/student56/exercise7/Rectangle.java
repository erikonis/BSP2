package lu.uni.programming1.lab2.exercise7;

import java.util.Scanner;


/**
 *  Class for Exercise 7
 */
public class Rectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int xmin,ymin,xmax,ymax,pointX,pointY;
		System.out.println("Please give in the coordinates of the rectangle(xmin, ymin, xmax, ymax):");
		xmin=scanner.nextInt();
		ymin=scanner.nextInt();
		xmax=scanner.nextInt();
		ymax=scanner.nextInt();

		if(xmin>xmax){
			xmin=xmin+xmax;
			xmax=xmin-xmax;
			xmin=xmin-xmax;
		}
		if(ymin>ymax){
			ymin=ymin+ymax;
			ymax=ymin-ymax;
			ymin=ymin-ymax;
		}

		System.out.println("Please enter the coordinates of the point to check(x,y):");
		pointX=scanner.nextInt();
		pointY=scanner.nextInt();

		if(pointX>=xmin && pointX <=xmax){
			if(pointY>=ymin && pointY<=ymax){
				System.out.println("The point is in the rectangle.");
			}else{
				System.out.println("The point isn't in the rectangle.");
			}
		}else{
			System.out.println("The point isn't in the rectangle.");
		}
		// TODO: put your code here

		scanner.close();
	}
}