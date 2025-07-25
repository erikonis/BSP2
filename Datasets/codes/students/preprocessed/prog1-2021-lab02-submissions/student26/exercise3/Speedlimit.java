import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter road type id: ");

		int roadTypeId = scanner.nextInt();

		System.out.print("Please enter your speed: ");

		double speed = scanner.nextDouble();
		double excess = 0;

		switch (roadTypeId) {
			case 1:
				if (speed <= 130) {
					System.out.println("Speed OK for motorway road.");
				} else {
					excess = speed - 130;
					System.out.println("Too fast for motorway road. " + excess + " over the limit!");
				}
				break;
			case 2:
				if (speed <= 90) {
					System.out.println("Speed OK for ordinary road.");
				} else {
					excess = speed - 90;
					System.out.println("Too fast for ordinary road. " + excess + " over the limit!");
				}
				break;
			case 3:
				if (speed <= 50) {
					System.out.println("Speed OK for town road.");
				} else {
					excess = speed - 50;
					System.out.println("Too fast for town road. " + excess + " over the limit!");
				}
				break;
			case 4:
				if (speed <= 30) {
					System.out.println("Speed OK for calmed road.");
				} else {
					excess = speed - 30;
					System.out.println("Too fast for calmed road. " + excess + " over the limit!");
				}
				break;
			default:
				System.out.println("Unknown road type: " + roadTypeId);
				break;
		}
		if (excess > 0) {
			switch (roadTypeId) {
				case 1:
					if (excess <= 130 * 0.05) {
						System.out.println("Fine: 0 Euro(s)");
					} else if (excess <= 130 * 0.30) {
						System.out.println("Fine: 50 Euro(s)");
					} else if (excess <= 130 * 0.50) {
						System.out.println("Fine: 150 Euro(s)");
					} else {
						System.out.println("Fine: 500 Euro(s)");
					}
					break;
				case 2:
					if (excess <= 90 * 0.05) {
						System.out.println("Fine: 0 Euro(s)");
					} else if (excess <= 90 * 0.30) {
						System.out.println("Fine: 50 Euro(s)");
					} else if (excess <= 90 * 0.50) {
						System.out.println("Fine: 150 Euro(s)");
					} else {
						System.out.println("Fine: 500 Euro(s)");
					}
					break;
				case 3:
					if (excess <= 50 * 0.05) {
						System.out.println("Fine: 0 Euro(s)");
					} else if (excess <= 50 * 0.30) {
						System.out.println("Fine: 50 Euro(s)");
					} else if (excess <= 50 * 0.50) {
						System.out.println("Fine: 150 Euro(s)");
					} else {
						System.out.println("Fine: 500 Euro(s)");
					}
					break;
				case 4:
					if (excess <= 30 * 0.05) {
						System.out.println("Fine: 0 Euro(s)");
					} else if (excess <= 30 * 0.30) {
						System.out.println("Fine: 50 Euro(s)");
					} else if (excess <= 30 * 0.50) {
						System.out.println("Fine: 150 Euro(s)");
					} else {
						System.out.println("Fine: 500 Euro(s)");
					}
					break;

				default:
					break;
			}
		}

		scanner.close();
	}
}
