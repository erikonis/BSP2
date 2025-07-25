import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your road type id: 1.Motorway 2.Oridinary 3.Town 4.Calmed: ");

		int roadTypeId = scanner.nextInt();

		String roadType = "";
		Double speedLimit = 0.0;

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
			System.out.print("This is Unknown road type");
		}
		if (speedLimit != 0.0) {

			System.out.print("Please enter your current speed ");
			Double currentSpeed = scanner.nextDouble();
			if (currentSpeed > speedLimit) {
				Double excessSpeed = currentSpeed - speedLimit;
				System.out.print("It is too fast for " + roadType + " road. " + excessSpeed
						+ " You were drove over the limit! ");
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
				System.out.println("You will have to pay a fine of  €" + fine);
			} else {
				System.out.print("Your speed is OK for " + roadType + " road");
			}

		}



		scanner.close();
	}
}