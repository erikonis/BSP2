import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("rectangle collision detection");

		System.out.println("Xmin (top left corner)");
		double Xmin = scanner.nextDouble();

		System.out.println("Ymin (top left corner)");
		double Ymin = scanner.nextDouble();

		System.out.println("Xmax (bottom right corner)");
		double Xmax = scanner.nextDouble();

		System.out.println("Ymax (bottom right corner)");
		double Ymax = scanner.nextDouble();

		System.out.println("point X");
		double X = scanner.nextDouble();

		System.out.println("point Y");
		double Y = scanner.nextDouble();

		if (Y > Ymin && Y < Ymax && X > Xmin && X < Xmax){
			System.out.println("collision");
		}

		scanner.close();
	}
}