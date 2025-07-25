package lu.uni.programming1.lab2.exercise7;
import java.util.Scanner;

/**
 *  Class for Exercise 7
 */
public class Rectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int xP;
		int yP;

		int xMin;
		int yMin;
		int xMax;
		int yMax;



		System.out.println("Xp : ");
		xP = scanner.nextInt();
		System.out.println("Yp : ");
		yP = scanner.nextInt();

		System.out.println("Top-Left corner X : ");
		xMin = scanner.nextInt();
		System.out.println("Top-Left corner Y : ");
		yMin = scanner.nextInt();
		System.out.println("Lower-Right corner X : ");
		xMax = scanner.nextInt();
		System.out.println("Lower-Right corner Y : ");
		yMax = scanner.nextInt();

		if((xP>xMin)&&(xP<xMax)&&(yP<yMin)&&(yP>yMax)) System.out.println("it's inside");
		else System.out.println("it's outside");

		// TODO: put your code here
		
		scanner.close();
	}
}