import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter road type id: ");


		 int roadTypeId = scanner.nextInt();

		System.out.print("Please enter your travelling speed (in km/h): ");

		double speed = scanner.nextDouble();
		
		 int maxspeed = 0;
		
		if (roadTypeId == 1) {
			maxspeed = 130;
		} else if (roadTypeId == 2) {
			maxspeed = 90;
		} else if (roadTypeId == 3) {
			maxspeed = 50;
		} else if (roadTypeId == 4) {
			maxspeed = 30;
		}

		if (speed > maxspeed) {
			System.out.print("You are going too fast! Slow down!");
		}

		
		scanner.close();
	}
}