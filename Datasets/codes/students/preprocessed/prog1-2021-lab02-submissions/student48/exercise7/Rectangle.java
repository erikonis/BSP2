import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Give coordinates for the rectangle :xmin, xmax, ymin, ymax :");
		double xmin = scanner.nextDouble();
		double xmax = scanner.nextDouble();
		double ymin = scanner.nextDouble();
		double ymax = scanner.nextDouble();

		System.out.println("Give the coordinates for the point: x and y : ");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();

		
		if ((xmin<=x)&&(x<=xmax)&&(ymin<=y)&&(y<=ymax)){
			System.out.println("The point is inside your rectangle.");
		}
			else if ((xmin>x)||(x>xmax)||(ymin>y)||(y>ymax)){
			System.out.println("The point is NOT inside your rectangle.");
		}

		scanner.close();
	}
}