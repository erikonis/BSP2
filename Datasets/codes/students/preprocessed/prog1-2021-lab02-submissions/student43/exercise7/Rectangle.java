import java.util.Scanner;

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
		if ((pointx > startx) && (pointx < endx)){
			if ((pointy > starty) && (pointy < endy)){
				System.out.println("The point is in the rectangle");}
			else System.out.println("The point is not in the rectangle");}
			else System.out.println("The point is not in the rectangle");
		
		scanner.close();
	}
}