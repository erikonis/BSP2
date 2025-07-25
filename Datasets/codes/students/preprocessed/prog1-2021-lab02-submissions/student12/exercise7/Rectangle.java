import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int xp, yp, xmin, ymin, xmax, ymax;
		String result;
		System.out.println("Please enter x coordinate of Point :");
		xp = scanner.nextInt();
		System.out.println("Please enter y coordinate of Point :");
		yp = scanner.nextInt();
		System.out.println("Please enter xmin coordinate of rectangle :");
		xmin = scanner.nextInt();
		System.out.println("Please enter xmax coordinate of rectangle :");
		xmax = scanner.nextInt();
		System.out.println("Please enter ymin coordinate of rectangle :");
		ymin = scanner.nextInt();
		System.out.println("Please enter ymax coordinate of rectangle :");
		ymax = scanner.nextInt();

		result = (xp >= xmin && xp <= xmax && yp >= ymin && yp <= ymax)
				? "The point(" + xp + "," + yp + ") is inside the rectangle"
				: "The point(" + xp + "," + yp + ") is not inside the rectangle";
		System.out.println(result);

		scanner.close();
	}
}