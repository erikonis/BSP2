import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int roadTypeId = 0;
		String roadType = "";
		Double speedLimit = 0.0;
		while (roadTypeId != 1 && roadTypeId != 2 && roadTypeId != 3 && roadTypeId != 4) {
			System.out.println("\nPlease type 1 to 4");
			System.out.print("\nPlease enter road type id: ");
			roadTypeId = scanner.nextInt();

			if (roadTypeId == 1) {
				roadType = "Motorway";
				speedLimit = 130.0;
			} else if (roadTypeId == 2) {
				roadType = "Ordinary";
				speedLimit = 90.0;
			} else if (roadTypeId == 3) {
				roadType = "Town";
				speedLimit = 50.0;
			} else if (roadTypeId == 4) {
				roadType = "Calmed";
				speedLimit = 30.0;
			} else {
				System.out.print("Unknown road type");
			}
		}
		if (speedLimit != 0.0) {

			System.out.print("Please enter current speed ");
			Double currentSpeed = scanner.nextDouble();
			if (currentSpeed > speedLimit) {
				Double excessSpeed = currentSpeed - speedLimit;
				System.out.print("Too fast for " + roadType + " road. " + excessSpeed + " over the limit! ");
				Double percentageExcess = (excessSpeed * 100.0) / speedLimit;
				/* System.out.println(percentageExcess); */
				int fine = 0;
				if (percentageExcess < 5) {
					fine = 0;
				} else if (percentageExcess < 30) {
					fine = 50;
				} else if (percentageExcess < 50) {
					fine = 150;
				} else {
					fine = 500;
				}
				System.out.println("You will have to pay €" + fine);
			} else {
				System.out.print("Speed OK for " + roadType + " road");
			}

		}


		scanner.close();
	}
}