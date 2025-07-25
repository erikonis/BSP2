import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		int tlX, tlY, brX, brY, pX, pY;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the coordinates of the top left corner of your rectangle :");
		System.out.println("X coordinate : ");
		tlX = scanner.nextInt();
		System.out.println("Y coordinate : ");
		tlY = scanner.nextInt();
		System.out.println("Please enter the coordinates of the bottom right corner of your rectangle :");
		System.out.println("X coordinate : ");
		brX = scanner.nextInt();
		System.out.println("Y coordinate : ");
		brY = scanner.nextInt();
		if(tlX > brX){
			int temp = brX;
			brX = tlX;
			tlX = temp;
		}
		if(tlY > brY){
			int temp = brY;
			brY = tlY;
			tlY = temp;
		}
		System.out.println("Please enter the coordinates of the point :");
		System.out.println("X coordinate : ");
		pX = scanner.nextInt();
		System.out.println("Y coordinate : ");
		pY = scanner.nextInt();

		if(pX>tlX && pX < brX && pY > tlY && pY < brY){ //this is considering that positive x is on the right side of the origin and positive y axis is under
			System.out.println("The point is in the rectangle.");
		}
		else{
			System.out.println("The point is not in the rectangle.");
		}
		scanner.close();
	}
}