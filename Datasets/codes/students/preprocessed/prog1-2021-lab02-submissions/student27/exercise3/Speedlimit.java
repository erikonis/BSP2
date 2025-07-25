import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter road type id: ");

		int roadTypeId = scanner.nextInt();


		System.out.print("Please enter your speed: ");

		double speed = scanner.nextDouble();

		double excess;

		double excessRange = 0;

		boolean fine = false;
		int fineAmount = 0;


		if (roadTypeId == 1) {
			if (speed > 130) {
				excess = speed-130;
				System.out.println("Too fast for motorway. " + excess + " over the limit!");
				excessRange = 100-(130/speed*100);
				fine = true;
			} else {
				System.out.println("Speed OK for motorway");
			}
		} else if (roadTypeId == 2) {
			if (speed > 90) {
				excess = speed-90;
				System.out.println("Too fast for ordinary road. " + excess + " over the limit!");
				excessRange = 100-(90/speed*100);
				fine = true;
			} else {
				System.out.println("Speed OK for ordinary road");
			}
		} else if (roadTypeId == 3){
			if (speed > 50) {
				excess = speed-50;
				System.out.println("Too fast for town. " + excess + " over the limit!");
				excessRange = 100-(50/speed*100);
				fine = true;
			} else {
				System.out.println("Speed OK for town");
			}
		} else if (roadTypeId == 4) {
			if (speed > 30) {
				excess = speed-30;
				System.out.println("Too fast for calmed road. " + excess + " over the limit!");
				excessRange = 100-(30/speed*100);
				fine = true;
			} else {
				System.out.println("Speed OK for calmed road");
			}
		} else {
			System.out.println("Unknown road type: " + roadTypeId);
		}

		if (fine) {
			if (excessRange <= 5) {
				fineAmount = 0;
			} else if (excessRange > 5 && excessRange <= 30) {
				fineAmount = 50;
			} else if (excessRange > 30 && excessRange <= 50) {
				fineAmount = 150;
			} else {
				fineAmount = 500;
			}
			System.out.println("Your fine is : " + fineAmount + " €");
		}






		
		scanner.close();
	}
}