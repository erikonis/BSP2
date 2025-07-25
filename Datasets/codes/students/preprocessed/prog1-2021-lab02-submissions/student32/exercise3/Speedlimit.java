import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter road type id: ");

		int roadTypeId = scanner.nextInt();


		String RoadType = "";
		int speedlimit = 0;
		boolean speeding = false;


		if (roadTypeId == 1) {
			RoadType = "motorway";
			speedlimit = 130;
		}

		if (roadTypeId == 2) {
			RoadType = "ordinary";
			speedlimit = 90;
		}

		if (roadTypeId == 3) {
			RoadType = "town";
			speedlimit = 50;
		}

		if (roadTypeId == 4) {
			RoadType = "calmed";
			speedlimit = 30;
		}

		System.out.print("Please enter the current speed: ");

		double currentspeed = scanner.nextDouble();


		if (1 <= roadTypeId && roadTypeId <= 4) {

			if (currentspeed <= speedlimit) {
				System.out.println("Speed OK for " + RoadType + " road.");
			} else {
				System.out.println("Too fast for " + RoadType + " road. " + (currentspeed - speedlimit) + " over the limit!");
				speeding = true;
			}

		} else {
			System.out.println("Unknown road type: " + roadTypeId);
		}

		
		int fine;

		
		if (speeding == true) {
			if (currentspeed <= speedlimit + speedlimit * 0.05) {
				fine = 0;
			}
			else if (currentspeed <= speedlimit + speedlimit * 0.3) {
				fine = 50;
			}
			else if (currentspeed <= speedlimit + speedlimit * 0.5) {
				fine = 150;
			}
			else {
				fine = 500;
			}
			System.out.println("The fine you could receive would be a fine of " + fine + "€.");
		}
		
		scanner.close();
	}
}