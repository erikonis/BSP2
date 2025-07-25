import java.util.Scanner;

public class Speedlimit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

			System.out.print("Please enter road type id: ");

			int roadTypeId = scanner.nextInt();


					int Limit;
					String roadName;
						
						if (roadTypeId == (int) 1)
							{Limit = 130 ; roadName = "motorway";}

						else if (roadTypeId == (int) 2)
							{Limit = 90; roadName = "ordinary";}

						else if (roadTypeId == (int) 3)
							{Limit = 50; roadName = "town";}

						else if (roadTypeId == (int) 4)
							{Limit = 30; roadName = "calmed";}

						else {
								roadName = "Unknown";
								System.out.println("Unknown road type: " + roadTypeId);
								Limit = 0;
								System.exit(0);
							}

			System.out.println("Please enter speed: (km/h)");

			double Speed = scanner.nextDouble();


			scanner.close();

			if (Speed < 0)
				{System.out.println("Invalid velocity, please enter a positive speed.");
				System.exit(0);}

			if (Speed <= Limit)
				{System.out.println("Speed OK for " + roadName + " road.");
			
					System.exit(0);

				}

			double SpeedExcess;

				SpeedExcess = Speed - Limit;

					System.out.println("Too fast for " + roadName + " road. " + SpeedExcess + " km/h over the limit!");

			int Fine;	

				double SpeedExcessPercent = ((SpeedExcess/Limit)*100);

					if (SpeedExcessPercent > 0 && SpeedExcessPercent <= 5)
						Fine = 0;

					else if (SpeedExcessPercent > 5 && SpeedExcessPercent <= 30)
						Fine = 50;

					else if (SpeedExcessPercent > 30 && SpeedExcessPercent <= 50)
						Fine = 150;

					else Fine = 500;
			
			SpeedExcessPercent = Math.round(SpeedExcessPercent*10.0)/10.0;

			System.out.println("Speed limit = " + Limit + " km/h");
			System.out.println("Speed driven = " + Speed + " km/h");
			System.out.println("Speed excess = " + SpeedExcess + " km/h");
			System.out.println("Speed excess = " + SpeedExcessPercent + " %");
			System.out.println("Fine = " + Fine + " €");
					
	}
}