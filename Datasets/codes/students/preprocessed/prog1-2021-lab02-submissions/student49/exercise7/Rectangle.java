import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the coordinates of a point:");
		System.out.print("x = ");
		int x = scanner.nextInt();
		System.out.print("y = ");
		int y = scanner.nextInt();

		System.out.println("Enter the coordinates of the lower left corner of the rectangle:");
		System.out.print("x = ");
		int xMin = scanner.nextInt();
		System.out.print("y = ");
		int yMin = scanner.nextInt();

		System.out.println("Enter the coordinates of the upper right corner of the rectangle:");
		System.out.print("x = ");
		int xMax = scanner.nextInt();
		System.out.print("y = ");
		int yMax = scanner.nextInt();

		if (xMin > xMax || yMin > yMax) {
			System.out.println("The limits of the specified rectangle are infeasible.");
			System.exit(1);
		}

		if (xMin <= x && x <= xMax && yMin <= y && y <= yMax) {
			System.out.println("The point lies within the rectangle!");
		} else {
			System.out.println("The point does not lie within the rectangle!");
		}
		scanner.close();
	}
}