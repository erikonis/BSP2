import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {
		String RoadType;
		double Speedlimit;
		double excess;
		double excessrangeperecntage;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter road type id: ");

		int roadTypeId = scanner.nextInt();

		System.out.println("Please enter the drivers traveling speed: ");
		double speed = scanner.nextDouble();

		if (roadTypeId == 1) {
			RoadType = "motorway";
			Speedlimit = 130;
			excess = speed - Speedlimit;
			if (excess <= 0) {
				System.out.println("Speed OK for " + RoadType + " road.");
			} else {
				System.out.println("Too fast for " + RoadType + " road. " + excess + " over the limit!");
				excessrangeperecntage = speed / Speedlimit - 1;

				if (excessrangeperecntage <= 0.05) {
					System.out.println("Your fine for speeding " + (int) (excessrangeperecntage * 100)
							+ "% is going to be 0 Euros");
				}
				if (excessrangeperecntage <= 0.3 && excessrangeperecntage > 0.05) {
					System.out.println("Your fine for speeding " + (int) (excessrangeperecntage * 100)
							+ "% is going to be 50 Euros");
				}
				if (excessrangeperecntage <= 0.5 && excessrangeperecntage > 0.3) {
					System.out.println("Your fine for speeding " + (int) (excessrangeperecntage * 100)
							+ "% is going to be 150 Euros");
				}
				if (excessrangeperecntage > 0.50) {

					System.out.println("Your fine for speeding " + (int) (excessrangeperecntage * 100)
							+ "% is going to be 500 Euros");
				}

			}
		}
		if (roadTypeId == 2) {
			RoadType = "ordinary";
			Speedlimit = 90;
			excess = speed - Speedlimit;
			if (excess <= 0)

			{
				System.out.println("Speed OK for " + RoadType + " road.");
			} else {
				System.out.println("Too fast for " + RoadType + " road. " + excess + " over the limit!");
				excessrangeperecntage = speed / Speedlimit - 1;
				if (excessrangeperecntage <= 0.05) {
					System.out.println("Your fine for speeding " + (int) (excessrangeperecntage * 100)
							+ "% is going to be 0 Euros");
				}
				if (excessrangeperecntage <= 0.3 && excessrangeperecntage > 0.05) {
					System.out.println("Your fine for speeding " + (int) (excessrangeperecntage * 100)
							+ "% is going to be 50 Euros");
				}
				if (excessrangeperecntage <= 0.5 && excessrangeperecntage > 0.3) {
					System.out.println("Your fine for speeding " + (int) (excessrangeperecntage * 100)
							+ "% is going to be 150 Euros");
				}
				if (excessrangeperecntage > 0.5) {
					System.out.println("Your fine for speeding " + (int) (excessrangeperecntage * 100)
							+ "% is going to be 500 Euros");
				}
			}
		}
		if (roadTypeId == 3) {
			RoadType = "town";
			Speedlimit = 50;
			excess = speed - Speedlimit;
			if (excess <= 0) {
				System.out.println("Speed OK for " + RoadType + " road.");
			} else {
				System.out.println("Too fast for " + RoadType + " road. " + excess + " over the limit!");
				excessrangeperecntage = speed / Speedlimit - 1;
				if (excessrangeperecntage <= 0.05) {
					System.out.println("Your fine for speeding " + (int) (excessrangeperecntage * 100)
							+ "% is going to be 0 Euros");
				}
				if (excessrangeperecntage <= 0.3 && excessrangeperecntage > 0.05) {
					System.out.println("Your fine for speeding " + (int) (excessrangeperecntage * 100)
							+ "% is going to be 50 Euros");
				}
				if (excessrangeperecntage <= 0.5 && excessrangeperecntage > 0.3) {
					System.out.println("Your fine for speeding " + (int) (excessrangeperecntage * 100)
							+ "% is going to be 150 Euros");
				}
				if (excessrangeperecntage > 0.5) {
					System.out.println("Your fine for speeding " + (int) (excessrangeperecntage * 100)
							+ "% is going to be 500 Euros");
				}
			}
		}
		if (roadTypeId == 4) {
			RoadType = "calmed";
			Speedlimit = 30;
			excess = speed - Speedlimit;
			if (excess <= 0) {
				System.out.println("Speed OK for " + RoadType + " road.");
			} else {
				System.out.println("Too fast for " + RoadType + " road. " + excess + " over the limit!");
				excessrangeperecntage = speed / Speedlimit - 1;
				if (excessrangeperecntage <= 0.05) {
					System.out.println("Your fine for speeding " + (int) (excessrangeperecntage * 100)
							+ "% is going to be 0 Euros");
				}
				if (excessrangeperecntage <= 0.3 && excessrangeperecntage > 0.05) {
					System.out.println("Your fine for speeding " + (int) (excessrangeperecntage * 100)
							+ "% is going to be 50 Euros");
				}
				if (excessrangeperecntage <= 0.5 && excessrangeperecntage > 0.3) {
					System.out.println("Your fine for speeding " + (int) (excessrangeperecntage * 100)
							+ "% is going to be 150 Euros");
				}
				if (excessrangeperecntage > 0.5) {
					System.out.println("Your fine for speeding " + (int) (excessrangeperecntage * 100)
							+ "% is going to be 500 Euros");
				}
			}
		}



		scanner.close();
	}
}